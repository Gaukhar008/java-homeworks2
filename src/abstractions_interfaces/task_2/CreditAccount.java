package task_2;

public class CreditAccount extends Account {

    CreditAccount(double balance) {
        super(balance);
    }

    @Override
    public void pay(double amount) {
        this.setBalance(this.getBalance() - amount);
    }

    @Override
    public void addMoney(double amount) {
        if (this.getBalance() + amount <= 0) {
            this.setBalance(this.getBalance() + amount);
        } else {
            System.out.println("You exceeded the amount that you can add to Credit Account." +
                    "You can top up the credit account only with this amount: " + (this.getBalance()));
        }
    }

    @Override
    public void transfer(Account account,double amount) {
        System.out.println("It is not possible to transfer money from credit account!");
    }
}
