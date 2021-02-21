package darbas_grupese.grupeKMI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        OS linux = new Linux("Linux",1000,true, "Mint");
        OS mac = new Mac("mac",200,false,true);
        OS windows = new Windows("Windows",500,"3.11");

        List<OS>osMasyvas = new ArrayList<>();

        osMasyvas.add(linux);
        osMasyvas.add(mac);
        osMasyvas.add(windows);

        Collections.sort(osMasyvas);

        System.out.println(osMasyvas);
        System.out.println("*********************************************************");
        for (OS osMasyva : osMasyvas) {
            System.out.println(osMasyva);
        }

    }
}
