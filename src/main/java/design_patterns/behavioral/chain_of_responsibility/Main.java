package design_patterns.behavioral.chain_of_responsibility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMDispenserChain atmDispenserChain = new ATMDispenserChain();

        while (true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner scanner = new Scanner(System.in);

            amount = scanner.nextInt();

            //viena is salygu
            if (amount % 10 !=0 || amount == 0) {
                System.out.println("Amount should be multiple of 10s");
                break;
            }

            atmDispenserChain.getFirstChainElement().dispense(new Currency(amount));
        }
    }
}
