package darbas_grupese.grupeKTA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {

   public static List<Account> dataBaseAccounts = new ArrayList<>();


    public static List<Account> getDataBaseAccounts() {
        return dataBaseAccounts;
    }

    public static void setDataBaseAccounts() {

        dataBaseAccounts.add(new Account("petras", "petras2", 150));
//                new Account("Jonas", "jonas2", 200),
//                new Account("antanas", "antanas2", 250));

//        DataBase.dataBaseAccounts = dataBaseAccounts;
    }
}
