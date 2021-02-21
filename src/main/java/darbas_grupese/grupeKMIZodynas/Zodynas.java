package darbas_grupese.grupeKMIZodynas;
/**
 * https://github.com/DariusSakas/JAVA10_HW_FEB/tree/master/src/main/java/Zodynas
 */

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Zodynas {

    public HashMap<String, String> zodynas = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    void zodynasMenu() {
        String choiceValue;
        do {

            System.out.println("Spausti A, kad prideti zodi ir jo aprasyma");
            System.out.println("Spausti B, kad paziureti visa zodyna ir pasirinkti zodi");

            choiceValue = scanner.nextLine().toLowerCase(Locale.ROOT);

            switch (choiceValue) {
                case "a":
                    System.out.println("Iveskite zodi ir aprasyma");
                    createANewWord();
                    break;
                case "b":
                    System.out.println("Pasirinkite zodi is saraso, kad gauti aprasyma");
                    showWordList();
                    break;
                default:
                    System.out.println("No such option! Try again!");
            }

        } while (!choiceValue.equals("x"));
    }

    public void createANewWord() {
        System.out.println("Iveskite norima zodi:");
        String zodis = scanner.nextLine();
        System.out.println("Iveskite norima aprasyma:");
        String aprasymas = scanner.nextLine();

        zodynas.put(zodis, aprasymas);
    }

    public void showWordList() {
        for (String key : zodynas.keySet()) {

            System.out.println(key);

        }
        chooseWordFromList();
    }

    public void chooseWordFromList() {

        String inputValue = scanner.nextLine();

        for (Map.Entry<String, String> stringStringEntry : zodynas.entrySet()) {
            if (inputValue.equalsIgnoreCase(stringStringEntry.getKey())) {
                if(inputValue.isEmpty())
                    System.out.println("Tokio zodzio nera");
                else
                    System.out.println(stringStringEntry.getValue());
            }

        }
    }
}
