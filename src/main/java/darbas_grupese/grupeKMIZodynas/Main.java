package darbas_grupese.grupeKMIZodynas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String zodis = scanner.nextLine();
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Masina", "Vaziuoja");
        dictionary.put("Lektuvas", "Skrenda");
        dictionary.put("Laivas", "Plaukia");
        dictionary.put("Suo", "Loja");
        dictionary.put("Kate", "Kniaukia");

        for (int i = 0; i < dictionary.size(); i++ ) {
            if (dictionary.containsKey(zodis)) {
                System.out.println(dictionary.get(zodis));
                break;
            }
        }

        System.out.println("ar nori pridet irasa");
        String statement = scanner.nextLine();

        if (statement.equals("taip")) {
            String exitLoop = null;
            while (!exitLoop.equals("stop")){
                System.out.println("irasyk zodi:");
                String keyValue = scanner.nextLine();

                System.out.println("irasyk aprasyma:");
                String value = scanner.nextLine();

                dictionary.put(keyValue,value);
                System.out.println("irasyk stop jei baigei");
                exitLoop = scanner.nextLine();
                break;
            }


        }


    }
}
