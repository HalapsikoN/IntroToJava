package by.epam.unit04.task3.logic;

import by.epam.unit04.task3.entity.Account;
import by.epam.unit04.task3.entity.Client;

import java.util.Collections;

public class ClientLogic {

    public Account findAccountByNumber(Client client, int numberOfAccount) {
        Account searchAccount = new Account();
        for (Account account : client.getAccounts()) {
            if (account.getNumberOfAccount() == numberOfAccount) {
                searchAccount = account;
            }
        }
        return searchAccount;
    }

    public void blockAccountByNumber(Client client, int numberOfAccount) {
        Account account = findAccountByNumber(client, numberOfAccount);
        account.setBlock(true);
    }

    public void unblockAccountByNumber(Client client, int numberOfAccount) {
        Account account = findAccountByNumber(client, numberOfAccount);
        account.setBlock(false);
    }

    public void sortAccountsByAmount(Client client) {
        Collections.sort(client.getAccounts());
    }

    public double amountByAllAccounts(Client client) {
        double result = 0;
        for (Account account : client.getAccounts()) {
            result += account.getAmount();
        }
        return result;
    }

    public double amountOfPositiveAccounts(Client client) {
        double result = 0;
        for (Account account : client.getAccounts()) {
            if (account.getAmount() > 0) {
                result += account.getAmount();
            }
        }
        return result;
    }

    public double amountOfNegativeAccounts(Client client) {
        double result = 0;
        for (Account account : client.getAccounts()) {
            if (account.getAmount() < 0) {
                result += account.getAmount();
            }
        }
        return result;
    }

}
