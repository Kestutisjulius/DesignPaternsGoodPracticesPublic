package design_patterns.behavioral.command;

/** INTENT
 * Command is a behavioral design pattern that turns a request into a stand-alone object that
 * contains all information about the request.
 * This transformation lets you parameterize methods with different requests, delay or queue a request’s execution,
 * and support undoable operations.
 * ------------
 * „Command“ yra elgesio dizaino modelis, paverčiantis užklausą atskiru objektu, kuriame yra visa informacija apie užklausą.
 * Ši transformacija leidžia jums nustatyti metodus su skirtingomis užklausomis, uždelsti arba pateikti eilę užklausos
 * vykdymui ir palaikyti neatšaukiamas operacijas.
 *
 ** Problem
 * Imagine that you’re working on a new text-editor app. Your current task is to create a toolbar with a bunch of buttons
 * for various operations of the editor. You created a very neat Button class that can be used for buttons on the toolbar,
 * as well as for generic buttons in various dialogs.
 * While all of these buttons look similar, they’re all supposed to do different things. Where would you put the code for the various
 * click handlers of these buttons? The simplest solution is to create tons of subclasses for each place where the button is used.
 * These subclasses would contain the code that would have to be executed on a button click.
 * Before long, you realize that this approach is deeply flawed. First, you have an enormous number of subclasses, and that would be
 * okay if you weren’t risking breaking the code in these subclasses each time you modify the base Button class. Put simply, your
 * GUI code has become awkwardly dependent on the volatile code of the business logic.
 * And here’s the ugliest part. Some operations, such as copying/pasting text, would need to be invoked from multiple places. For example, a user could click a small “Copy” button on the toolbar, or copy something via the context menu, or just hit Ctrl+C on the keyboard.
 * Initially, when our app only had the toolbar, it was okay to place the implementation of various operations into the button subclasses.
 * In other words, having the code for copying text inside the CopyButton subclass was fine. But then, when you implement context menus,
 * shortcuts, and other stuff, you have to either duplicate the operation’s code in many classes or make menus dependent on buttons, which
 * is an even worse option.
 *-------------------
 * Įsivaizduokite, kad dirbate su nauja teksto redaktoriaus programa. Dabartinė jūsų užduotis yra sukurti įrankių juostą
 * su daugybe mygtukų įvairioms redaktoriaus operacijoms atlikti. Sukūrėte labai tvarkingą mygtukų klasę, kurią galima naudoti
 * mygtukams įrankių juostoje, taip pat bendriesiems mygtukams įvairiuose dialogo languose.
 * Nors visi šie mygtukai atrodo panašūs, jie visi turėtų daryti skirtingus dalykus. Kur įdėtumėte šių mygtukų įvairių paspaudimų
 * tvarkytuvų kodą? Paprasčiausias sprendimas yra sukurti daugybę poklasių kiekvienai vietai, kurioje naudojamas mygtukas.
 * Šiuose poklasiuose būtų kodas, kurį reikės atlikti spustelėjus mygtuką.
 * Neilgai trukus supranti, kad šis požiūris yra labai ydingas. Pirma, turite labai daug poklasių, ir tai būtų gerai,
 * jei nerizikuotumėte sulaužyti šių poklasių kodo kiekvieną kartą, kai modifikuosite pagrindinę mygtukų klasę. Paprasčiau tariant,
 * jūsų GUI kodas tapo nepatogiai priklausomas nuo nepastovaus verslo logikos kodo.
 * O štai bjauriausia dalis. Kai kurias operacijas, pavyzdžiui, teksto kopijavimą / įklijavimą, reikės iškviesti iš kelių vietų.
 * Pvz., Vartotojas įrankių juostoje gali spustelėti nedidelį mygtuką „Kopijuoti“ arba ką nors nukopijuoti per kontekstinį meniu, arba tiesiog
 * paspausti klaviatūros klavišus „Ctrl“ + C
 * Iš pradžių, kai mūsų programoje buvo tik įrankių juosta, buvo gerai įdėti įvairių operacijų įgyvendinimą į mygtukų poklasius.
 * Kitaip tariant, turėti kodą tekstui kopijuoti „Copy Button“ poklasyje buvo puiku. Bet tada, kai įgyvendinate kontekstinius meniu,
 * sparčiuosius klavišus ir kitus dalykus, turite dauginti operacijos kodą daugelyje klasių arba padaryti meniu priklausomus nuo mygtukų,
 * o tai yra dar blogesnė galimybė.
 *
 **Solution
 * Good software design is often based on the principle of separation of concerns, which usually results in breaking an app into layers.
 * The most common example: a layer for the graphical user interface and another layer for the business logic.
 * The GUI layer is responsible for rendering a beautiful picture on the screen, capturing any input and showing results of what the user
 * and the app are doing. However, when it comes to doing something important, like calculating the trajectory of the moon or composing an
 * annual report, the GUI layer delegates the work to the underlying layer of business logic.
 * In the code it might look like this: a GUI object calls a method of a business logic object, passing it some arguments.
 * This process is usually described as one object sending another a request.
 * The Command pattern suggests that GUI objects shouldn’t send these requests directly. Instead, you should extract all of the request
 * details, such as the object being called, the name of the method and the list of arguments into a separate command class with a single
 * method that triggers this request.
 * Command objects serve as links between various GUI and business logic objects. From now on, the GUI object doesn’t need to know what
 * business logic object will receive the request and how it’ll be processed. The GUI object just triggers the command, which handles all
 * the details.
 * The next step is to make your commands implement the same interface. Usually it has just a single execution method that takes no parameters.
 * This interface lets you use various commands with the same request sender, without coupling it to concrete classes of commands. As a bonus,
 * now you can switch command objects linked to the sender, effectively changing the sender’s behavior at runtime.
 * You might have noticed one missing piece of the puzzle, which is the request parameters. A GUI object might have supplied the
 * business-layer object with some parameters. Since the command execution method doesn’t have any parameters, how would we pass the request
 * details to the receiver? It turns out the command should be either pre-configured with this data, or capable of getting it on its own.
 * Let’s get back to our text editor. After we apply the Command pattern, we no longer need all those button subclasses to implement various
 * click behaviors. It’s enough to put a single field into the base Button class that stores a reference to a command object and make the
 * button execute that command on a click.
 * You’ll implement a bunch of command classes for every possible operation and link them with particular buttons, depending on the buttons’
 * intended behavior.
 * Other GUI elements, such as menus, shortcuts or entire dialogs, can be implemented in the same way. They’ll be linked to a command which
 * gets executed when a user interacts with the GUI element. As you’ve probably guessed by now, the elements related to the same operations
 * will be linked to the same commands, preventing any code duplication.
 * As a result, commands become a convenient middle layer that reduces coupling between the GUI and business logic layers. And that’s only
 * a fraction of the benefits that the Command pattern can offer!
 * After a long walk through the city, you get to a nice restaurant and sit at the table by the window. A friendly waiter approaches you and
 * quickly takes your order, writing it down on a piece of paper. The waiter goes to the kitchen and sticks the order on the wall. After a
 * while, the order gets to the chef, who reads it and cooks the meal accordingly. The cook places the meal on a tray along with the order.
 * The waiter discovers the tray, checks the order to make sure everything is as you wanted it, and brings everything to your table.
 * The paper order serves as a command. It remains in a queue until the chef is ready to serve it. The order contains all the relevant
 * information required to cook the meal. It allows the chef to start cooking right away instead of running around clarifying the order
 * details from you directly.
 *
 * Geras programinės įrangos dizainas dažnai grindžiamas problemų atskyrimo principu, dėl kurio programa paprastai suskaidoma į sluoksnius.
 * Dažniausias pavyzdys: grafinės vartotojo sąsajos sluoksnis ir kitas verslo logikos sluoksnis. GUI sluoksnis yra atsakingas už gražaus
 * paveikslėlio atvaizdavimą ekrane, bet kokio įvesties užfiksavimą ir rezultatų, kuriuos daro vartotojas ir programa, rodymą. Tačiau kai
 * reikia padaryti ką nors svarbaus, pavyzdžiui, apskaičiuoti mėnulio trajektoriją ar sudaryti metinę ataskaitą, GUI sluoksnis paveda darbą
 * pagrindiniam verslo logikos sluoksniui.
 * Kode tai gali atrodyti taip: GUI objektas iškviečia verslo logikos objekto metodą, pateikdamas jam keletą argumentų.
 * Šis procesas paprastai apibūdinamas kaip vienas objektas, siunčiantis kitam prašymą.
 „Command“ modelis rodo, kad GUI objektai neturėtų siųsti šių užklausų tiesiogiai. Vietoj to turėtumėte išskleisti visą užklausos
 informaciją, pvz., Iškviečiamą objektą, metodo pavadinimą ir argumentų sąrašą į atskirą komandų klasę su vienu metodu, kuris suaktyvina
 šią užklausą.
 Komandos objektai tarnauja kaip sąsajos tarp įvairių GUI ir verslo logikos objektų. Nuo šiol GUI objektui nereikia žinoti, koks verslo
 logikos objektas gaus užklausą ir kaip jis bus apdorotas. GUI objektas tiesiog suaktyvina komandą, kuri tvarko visas detales.
 Kitas žingsnis - priversti komandas įgyvendinti tą pačią sąsają. Paprastai jis turi tik vieną vykdymo metodą, kuriam nereikia jokių parametrų.
 Ši sąsaja leidžia naudoti įvairias komandas su tuo pačiu užklausų siuntėju, nesiejant jos su konkrečiomis komandų klasėmis. Kaip premiją,
 dabar galite perjungti komandų objektus, susietus su siuntėju, efektyviai pakeisdami siuntėjo elgesį vykdymo metu.
 Galbūt pastebėjote vieną trūkusią dėlionės dalį, kuri yra užklausos parametrai. GUI objektas galėjo pateikti verslo sluoksnio objektui
 keletą parametrų. Kadangi komandos vykdymo metodas neturi jokių parametrų, kaip mes perduotume užklausos duomenis gavėjui? Pasirodo, kad
 komanda turėtų būti iš anksto sukonfigūruota naudojant šiuos duomenis arba galinti ją gauti savarankiškai.
 Grįžkime prie teksto redaktoriaus. Kai pritaikysime komandų šabloną, mums nebereikės visų tų mygtukų poklasių, kad būtų galima įgyvendinti
 įvairius paspaudimų veiksmus. Pakanka į pagrindinę mygtukų klasę įdėti vieną lauką, kuriame saugoma nuoroda į komandos objektą, ir priversti
 mygtuką atlikti tą komandą spustelėjus.
 Kiekvienai įmanomai operacijai įdiegsite daugybę komandų klasių ir susiesite jas su tam tikrais mygtukais, atsižvelgdami į numatomą mygtukų
 elgseną.
 Kiti GUI elementai, pvz., Meniu, nuorodos ar visi dialogai, gali būti įgyvendinami tokiu pačiu būdu. Jie bus susieti su komanda, kuri bus
 vykdoma vartotojui sąveikaujant su GUI elementu. Kaip jau tikriausiai atspėjote, elementai, susiję su tomis pačiomis operacijomis, bus
 susieti su tomis pačiomis komandomis, užkertant kelią bet kokiam kodo dubliavimui.
 Todėl komandos tampa patogiu viduriniu sluoksniu, kuris sumažina sąsają tarp GUI ir verslo logikos sluoksnių. Ir tai tik dalis naudos,
 kurią gali suteikti „Command“ modelis!
 * Po ilgo pasivaikščiojimo mieste pateksite į gražų restoraną ir atsisėsite prie stalo prie lango. Draugiškas padavėjas prieina prie jūsų
 * ir greitai priima jūsų užsakymą, užrašydamas jį ant popieriaus lapo. Padavėjas eina į virtuvę ir priklijuoja tvarką ant sienos. Po kurio
 * laiko užsakymas patenka į virėją, kuris jį perskaito ir atitinkamai gamina valgį. Virėjas patiekalą padeda ant padėklo kartu su užsakymu.
 * Padavėjas atranda dėklą, patikrina užsakymą ir įsitikina, kad viskas yra taip, kaip norėjai, ir atneša viską ant jūsų stalo.
 * Popierinis užsakymas tarnauja kaip komanda. Jis lieka eilėje, kol virėjas bus pasirengęs ją patiekti. Užsakyme pateikiama visa reikalinga
 * informacija, reikalinga patiekalui gaminti. Tai leidžia virėjui pradėti gaminti iš karto, užuot bėgiojus aiškintis užsakymo informaciją
 * tiesiogiai iš jūsų.
 */

public class INFO {


}
