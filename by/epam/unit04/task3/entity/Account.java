package by.epam.unit04.task3.entity;

public class Account implements Comparable<Account> {

    private int numberOfAccount;

    private double amount;

    private boolean block;

    public Account(int numberOfAccount, double amount, boolean block) {
        this.numberOfAccount = numberOfAccount;
        this.amount = amount;
        this.block = block;
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

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (numberOfAccount != account.numberOfAccount) return false;
        if (Double.compare(account.amount, amount) != 0) return false;
        return block == account.block;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberOfAccount;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (block ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "numberOfAccount=" + numberOfAccount +
                ", amount=" + amount +
                ", block=" + block +
                "}\n";
    }

    @Override
    public int compareTo(Account o) {
        return (int) (this.amount - o.amount);
    }
}
