package oops1;
public class BankAccountMain {
        public static void main(String[] args) {
            SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 5);
            CheckingAccount checkingAccount = new CheckingAccount("CA001", 2000, 500);
            savingsAccount.deposit(500);
            savingsAccount.withdraw(200);
            savingsAccount.calculateInterest();

            // Depositing and withdrawing from checking account
            checkingAccount.deposit(300);
            checkingAccount.withdraw(2500); // Exceeds overdraft limit
            checkingAccount.withdraw(1500); // Within overdraft limit
        }
    }


