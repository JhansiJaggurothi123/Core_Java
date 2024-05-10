package oops;
import java.util.*;
public class Employee {
        private String empId;
        private String name;
        private double salary;
        public Employee(String empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }
        public String getEmpId() {
            return empId;
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter details for Employee 1:");
            System.out.print("Enter the Empid: ");
            String empId1 = scanner.nextLine();
            System.out.print("Enter the Name: ");
            String name1 = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary1 = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            System.out.println("Enter details for Employee 2:");
            System.out.print("Enter the Empid: ");
            String empId2 = scanner.nextLine();
            System.out.print("Enter the Name: ");
            String name2 = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary2 = scanner.nextDouble();
            Employee employee1 = new Employee(empId1, name1, salary1);
            Employee employee2 = new Employee(empId2, name2, salary2);
            System.out.println("\n**** Stored data displayed below ****");
            displayEmployeeData(employee1);
            displayEmployeeData(employee2);
        }
        public static void displayEmployeeData(Employee employee) {
            System.out.println("\nEmployee id = " + employee.getEmpId());
            System.out.println("Employee name = " + employee.getName());
            System.out.println("Employee salary = " + employee.getSalary());
        }
    }


