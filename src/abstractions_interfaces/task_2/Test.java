package task_2;

public class Test {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(1000000);
        Account creditAccount = new CreditAccount(0);
        Account checkingAccount = new CheckingAccount(150000);

        savingsAccount.transfer(checkingAccount, 100000);
        System.out.println(savingsAccount.getBalance()); // balance of savingsAccount = 900000.0
        System.out.println(checkingAccount.getBalance()); // balance of checkingAccount = 250000.0
        savingsAccount.transfer(checkingAccount, 1100000); // prints "Insufficient funds on the card"
        System.out.println(savingsAccount.getBalance()); // balance of savingsAccount = 900000.0
        System.out.println(checkingAccount.getBalance()); // balance of checkingAccount = 250000.0
        savingsAccount.pay(50000); // prints "It is not possible to pay with savings account!"
        System.out.println(savingsAccount.getBalance()); // balance of savingsAccount = 900000.0
        savingsAccount.addMoney(400000);
        System.out.println(savingsAccount.getBalance()); // balance of savingsAccount = 1300000.0

        creditAccount.pay(75000);
        System.out.println(creditAccount.getBalance()); // balance of creditAccount = -75000.0
        creditAccount.transfer(checkingAccount, 50000); // prints "It is not possible to transfer money from credit account!"
        System.out.println(creditAccount.getBalance()); // balance of creditAccount = -75000.0
        creditAccount.addMoney(100000); // prints "You exceeded the amount that you can add to Credit Account.You can top up the credit account only with this amount: -75000.0"
        System.out.println(creditAccount.getBalance()); // balance of creditAccount = -75000.0
        creditAccount.addMoney(50000);
        System.out.println(creditAccount.getBalance()); // balance of creditAccount = -25000.0

        checkingAccount.pay(50000);
        System.out.println(checkingAccount.getBalance()); // balance of checkingAccount = 200000.0
        checkingAccount.pay(500000); // prints "Insufficient funds on the card"
        System.out.println(checkingAccount.getBalance()); // balance of checkingAccount = 200000.0
        checkingAccount.transfer(creditAccount, 100000); // prints "You exceeded the amount that you can add to Credit Account.You can top up the credit account only with this amount: -25000.0"
        System.out.println(checkingAccount.getBalance()); // balance of checkingAccount = 200000.0
        System.out.println(creditAccount.getBalance()); // balance of creditAccount = -25000.0
        checkingAccount.addMoney(55000);
        System.out.println(checkingAccount.getBalance()); // balance of checkingAccount = 255000.0
    }
}
