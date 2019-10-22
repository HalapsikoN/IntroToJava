package by.epam.financer.beans;

public class Account {

    private int numberOfAccount;
    private double amount;
    private boolean blocked;

    public Account(int numberOfAccount, double amount, boolean blocked) {
        this.numberOfAccount = numberOfAccount;
        this.amount = amount;
        this.blocked = blocked;
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
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (numberOfAccount != account.numberOfAccount) return false;
        if (Double.compare(account.amount, amount) != 0) return false;
        return blocked == account.blocked;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberOfAccount;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (blocked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberOfAccount=" + numberOfAccount +
                ", amount=" + amount +
                ", blocked=" + blocked +
                '}';
    }
}
