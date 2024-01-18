package task_2;

public class CheckingAccount extends Account {

    CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void pay(double amount) {
        if (this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Insufficient funds on the card");
        }
    }

    @Override
    public void addMoney(double amount) {
        this.setBalance(this.getBalance() + amount);
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

}
