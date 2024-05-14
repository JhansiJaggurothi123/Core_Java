package oops1;
public class EmployeeMain {
        public static void main(String[] args) {
            // Creating objects of Manager and Engineer
            Manager manager = new Manager("Alice", "M001", 50000, 10);
            Engineer engineer = new Engineer("Bob", "E001", 40000, 5000);

            // Calculating bonuses
            double managerBonus = manager.calculateBonus();
            double engineerBonus = engineer.calculateBonus();

            // Displaying bonuses
            System.out.println("Manager Bonus: $" + managerBonus);
            System.out.println("Engineer Bonus: $" + engineerBonus);

            // Creating an array of Employee objects
            Employee[] employees = {manager, engineer};

            // Calculating bonuses for each employee in the array
            System.out.println("\nEmployee Bonuses:");
            for (Employee employee : employees) {
                System.out.println("Employee: " + employee.getName() + ", Bonus: $" + employee.calculateBonus());
            }
        }
    }


