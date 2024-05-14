package oops1;
    class CheckingAccount extends BankAccount {
        private double overdraftLimit;

        public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
            super(accountNumber, balance);
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void withdraw(double amount) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Exceeds overdraft limit");
            }
        }
    }

