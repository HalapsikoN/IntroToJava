package by.epam.unit04.task3.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    private String name;

    private List<Account> accounts;

    public Client(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public Client(String name, Account account) {
        this.name = name;
        this.accounts = new ArrayList<>();
        this.accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!name.equals(client.name)) return false;
        return accounts.equals(client.accounts);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + accounts.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
