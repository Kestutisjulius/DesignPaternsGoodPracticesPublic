package darbas_grupese.grupePC;

import org.openqa.selenium.interactions.Keyboard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PCMain {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(17,"Sony",400);
        Processors processors1 = new Processors("Intel", 2000);
        Mouse mouse = new Mouse("Microsoft",200, true);
        Klavetura keyboard = new Klavetura("IBM",100,"EN");
        List<Gadget> gadgets = new ArrayList<>();
        gadgets.add(mouse);
        gadgets.add(keyboard);



//        PC pc = new PC(monitor1,processors1, gadgets, monitor1.getTotalPrice()+ processors1.getProce());
//        System.out.println(pc);
    }
}
