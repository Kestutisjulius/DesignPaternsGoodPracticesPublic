package darbas_grupese.grupeKTA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase.setDataBaseAccounts();
//        prisijungti();
        addNewAccount();





    }

    public static void addNewAccount (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("iveskite User name");
        String name = scanner.nextLine();
        System.out.println("iveskite norima slaptazodi");
        String password = scanner.nextLine();
        Account account = new Account(name,password,0);
        DataBase.getDataBaseAccounts().add(account);


    }

    private static void prisijungti() {
        System.out.println("Prisijungti: iveskite userName");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        for (Account account : DataBase.dataBaseAccounts) {
            if (name.equalsIgnoreCase(account.getUsername())){
                if (password.equals(account.getPassword())) {
                    System.out.println("prisijungta");
                    System.out.println("Balansas : " + account.getBalance());
                }
            }
        }
    }
}
