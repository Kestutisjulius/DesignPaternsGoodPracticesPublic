package home_work.colors_list;

import java.util.HashMap;

/**
 * Parašykite „Java“ programą, kad patikrintumėte, ar žemėlapyje yra nurodyto rakto atvaizdavimas
 */

public class HashMapMain {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("pirmas", 65);
        hashMap.put(65, "pirmas");
        Raktas raktas =new Raktas();
        raktas.setDoorNr(6);
        raktas.setName("bedroom");

        hashMap.put("rakto raktas", raktas);

        System.out.println("HashMap dydis: " + hashMap.size());

        for (Object value : hashMap.values()) {
            System.out.println(value);
            if (value.equals(raktas) ) {
                System.out.println("radau Nr." + raktas.getDoorNr());
            }

        }

    }
}
