package home_work.colors_list;

import java.util.Scanner;

public class ThreeNumbersMain {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input three Integer numbers");
        System.out.println("First: ");
        firstNumber = scanner.nextInt();
        System.out.println("Second: ");
        secondNumber = scanner.nextInt();
        System.out.println("Third: ");
        thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("your number: " + firstNumber + " are smallest");
        } else if (secondNumber < firstNumber && secondNumber<thirdNumber) {
            System.out.println("your number: " + secondNumber + " are smallest");
        } else {
            System.out.println("your number: " + thirdNumber + " are smallest");
        }
        System.out.println("average of these three numbers: " + ((double)(firstNumber+secondNumber+thirdNumber)/3));
    }

}
