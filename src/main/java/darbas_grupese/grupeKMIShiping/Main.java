package darbas_grupese.grupeKMIShiping;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Shipping shipping = null;

        String userInput = scanner.nextLine();
        if (userInput.equals("water")) {
            shipping = new ByWater();
        } else if (userInput.equals("air")) {
            shipping = new ByAir();
        } else if (userInput.equals("land")) {
            shipping = new ByLand();
        }else {
            System.out.println("wrong");
            shipping.Ship();
        }
        }
    }