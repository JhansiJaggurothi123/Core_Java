package oops1;
public class Employee {
        private String name;
        private String employeeId;
        private double salary;

        public Employee(String name, String employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public double getSalary() {
            return salary;
        }

        public double calculateBonus() {
            return 0; // Default bonus calculation for generic employee
        }
    }


