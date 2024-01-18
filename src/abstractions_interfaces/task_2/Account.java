package task_2;

public abstract class Account {
    private double balance;

    Account (double balance) {
        this.balance = balance;
    }
    public abstract void transfer(Account account,double amount);

    public abstract void pay(double amount);

    public abstract void addMoney(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
