package by.epam.unit04.task3.entity;

public class Account implements Comparable<Account> {

    private int numberOfAccount;

    private double amount;

    private boolean isBlocked;

    public Account(int numberOfAccount, double amount, boolean isBlocked) {
        this.numberOfAccount = numberOfAccount;
        this.amount = amount;
        this.isBlocked = isBlocked;
    }

    public Account() {
        this(0, 0, true);
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (numberOfAccount != account.numberOfAccount) return false;
        if (Double.compare(account.amount, amount) != 0) return false;
        return isBlocked == account.isBlocked;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberOfAccount;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isBlocked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "numberOfAccount=" + numberOfAccount +
                ", amount=" + amount +
                ", isBlocked=" + isBlocked +
                "}\n";
    }

    @Override
    public int compareTo(Account o) {
        return (int) (this.amount - o.amount);
    }
}
