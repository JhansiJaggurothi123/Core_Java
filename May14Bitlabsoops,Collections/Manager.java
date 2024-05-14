package oops1;
    class Manager extends Employee {
        private double bonusPercentage;

        public Manager(String name, String employeeId, double salary, double bonusPercentage) {
            super(name, employeeId, salary);
            this.bonusPercentage = bonusPercentage;
        }

        @Override
        public double calculateBonus() {
            return getSalary() * bonusPercentage / 100;
        }
    }


