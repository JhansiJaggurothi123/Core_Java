package oops1;
public class Engineer extends Employee {
        private double bonusFixedAmount;

        public Engineer(String name, String employeeId, double salary, double bonusFixedAmount) {
            super(name, employeeId, salary);
            this.bonusFixedAmount = bonusFixedAmount;
        }

        @Override
        public double calculateBonus() {
            return bonusFixedAmount;
        }
    }


