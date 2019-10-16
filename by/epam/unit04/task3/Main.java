package by.epam.unit04.task3;

import by.epam.unit04.task3.entity.Account;
import by.epam.unit04.task3.entity.Client;
import by.epam.unit04.task3.logic.ClientLogic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            int number = (int) (Math.random() * 10000);
            double amount = Math.random() * 1000 * ((Math.random() > 0.5) ? 1 : (-1));
            boolean block = Math.random() > 0.5;
            accounts.add(new Account(number, amount, block));
        }
        accounts.add(new Account(15, 50, false));

        Client client = new Client("Ivan", accounts);

        System.out.println(client);

        ClientLogic clientLogic = new ClientLogic();

        System.out.println("Account with number of account 15:");
        System.out.println(clientLogic.findAccountByNumber(client, 15));

        System.out.println("Block 15 account:");
        clientLogic.blockAccountByNumber(client, 15);
        System.out.println(clientLogic.findAccountByNumber(client, 15));

        System.out.println("Unblock 15 account:");
        clientLogic.unblockAccountByNumber(client, 15);
        System.out.println(clientLogic.findAccountByNumber(client, 15));

        clientLogic.sortAccountsByAmount(client);
        System.out.println("Sorted by amounts:");
        System.out.println(client);

        System.out.println("Total amount: " + clientLogic.amountByAllAccounts(client));
        System.out.println("Positive amount: " + clientLogic.amountOfPositiveAccounts(client));
        System.out.println("Negative amount: " + clientLogic.amountOfNegativeAccounts(client));
    }
}
