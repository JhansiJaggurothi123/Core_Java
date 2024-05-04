//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class BankAccount {
    private String AccountNum;
    private double balance;

    public BankAccount(String AccountNum, double balance) {
        this.AccountNum = AccountNum;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else
            System.out.println("insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}