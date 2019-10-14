package by.epam.unit04.task3;

import by.epam.unit04.task3.entity.Account;
import by.epam.unit04.task3.entity.Client;
import by.epam.unit04.task3.logic.ClientLogic;

public class Main {

    public static void main(String args[]) {

        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length - 1; ++i) {
            int number = (int) (Math.random() * 10000);
            double amount = Math.random() * 1000 * ((Math.random() > 0.5) ? 1 : (-1));
            boolean block = Math.random() > 0.5;
            accounts[i] = new Account(number, amount, block);
        }
        accounts[accounts.length - 1] = new Account(15, 50, false);

        Client client = new Client("Ivan", accounts);

        System.out.println(client);

        System.out.println("Account with number of account 15:");
        System.out.println(ClientLogic.findAccountByNumber(client, 15));

        System.out.println("Block 15 account:");
        ClientLogic.blockAccountByNumber(client, 15);
        System.out.println(ClientLogic.findAccountByNumber(client, 15));

        System.out.println("Unblock 15 account:");
        ClientLogic.unblockAccountByNumber(client, 15);
        System.out.println(ClientLogic.findAccountByNumber(client, 15));

        ClientLogic.sortAccountsByAmount(client);
        System.out.println("Sorted by amounts:");
        System.out.println(client);

        System.out.println("Total amount: " + ClientLogic.amountByAllAccounts(client));
        System.out.println("Positive amount: " + ClientLogic.amountOfPositiveAccounts(client));
        System.out.println("Negative amount: " + ClientLogic.amountOfNegativeAccounts(client));
    }
}
