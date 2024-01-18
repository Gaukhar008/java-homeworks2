package task_2;

public class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void transfer(Account account, double amount) {
        if (account instanceof CreditAccount && account.getBalance() + amount > 0) {
            System.out.println("You exceeded the amount that you can add to Credit Account." +
                    "You can top up the credit account only with this amount: " + (account.getBalance()));
        } else if (this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
            account.addMoney(amount);
        } else {
            System.out.println("Insufficient funds on the card");
        }
    }

    @Override
    public void addMoney(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    @Override
    public void pay(double amount) {
        System.out.println("It is not possible to pay with savings account!");
    }
}
