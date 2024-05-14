package oops1;
    class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }

        public void calculateInterest() {
            double interest = balance * interestRate / 100;
            deposit(interest);
            System.out.println("Interest calculated and added to balance: " + interest);
        }
    }
