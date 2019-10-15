package by.epam.unit04.task3.logic;

import by.epam.unit04.task3.entity.Account;
import by.epam.unit04.task3.entity.Client;

public class ClientLogic {

    public static Account findAccountByNumber(Client client, int numberOfAccount) {

        Account searchAccount = new Account();
        for (Account account : client.getAccounts()) {
            if (account.getNumberOfAccount() == numberOfAccount) {
                searchAccount = account;
            }
        }
        return searchAccount;
    }

    public static void blockAccountByNumber(Client client, int numberOfAccount) {

        Account account = findAccountByNumber(client, numberOfAccount);
        account.setBlock(true);
    }

    public static void unblockAccountByNumber(Client client, int numberOfAccount) {

        Account account = findAccountByNumber(client, numberOfAccount);
        account.setBlock(false);
    }

    public static void sortAccountsByAmount(Client client) {

        Account[] accounts = client.getAccounts();
        for (int i = 0; i < accounts.length - 1; ++i) {
            for (int j = i + 1; j < accounts.length; ++j) {
                if (accounts[i].compareTo(accounts[j]) > 0) {
                    Account temp = accounts[i];
                    accounts[i] = accounts[j];
                    accounts[j] = temp;
                }
            }
        }
    }

    public static double amountByAllAccounts(Client client) {

        double result = 0;
        Account[] accounts = client.getAccounts();
        for (Account account : accounts) {
            result += account.getAmount();
        }
        return result;
    }

    public static double amountOfPositiveAccounts(Client client) {

        double result = 0;
        Account[] accounts = client.getAccounts();
        for (Account account : accounts) {
            if (account.getAmount() > 0) {
                result += account.getAmount();
            }
        }
        return result;
    }

    public static double amountOfNegativeAccounts(Client client) {

        double result = 0;
        Account[] accounts = client.getAccounts();
        for (Account account : accounts) {
            if (account.getAmount() < 0) {
                result += account.getAmount();
            }
        }
        return result;
    }

}
