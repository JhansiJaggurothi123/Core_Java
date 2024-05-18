package StudentManagementSystem;
import java.util.*;
    public class Main {
        private static Scanner scanner = new Scanner(System.in);
        private static StudentManagementSystem system = new StudentManagementSystem();
        private static final String ADMIN_USERNAME = "ravi";
        private static final String ADMIN_PASSWORD = "ravi@123";

        public static void main(String[] args) {
            Student s1 = new Student(1, "John Doe", 15, "10th Grade", "123-456-7890");
            Student s2 = new Student(2, "Jane Smith", 14, "9th Grade", "234-567-8901");
            Student s3 = new Student(3, "Alice Johnson", 16, "11th Grade", "345-678-9012");
            Student s4 = new Student(4, "Bob Brown", 17, "12th Grade", "456-789-0123");
            Student s5 = new Student(5, "Charlie Davis", 15, "10th Grade", "567-890-1234");

            system.createStudent(s1);
            system.createStudent(s2);
            system.createStudent(s3);
            system.createStudent(s4);
            system.createStudent(s5);
            int choice;
            boolean isAdmin = false;
            do {
                displayMenu(isAdmin);
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        if (!isAdmin) {
                            isAdmin = adminLogin();
                        } else {
                            adminOperations();
                        }
                        break;
                    case 2:
                        if (isAdmin) {
                            addStudent();
                        } else {
                            System.out.println("Access denied. Admin login required.");
                        }
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        if (isAdmin) {
                            updateStudent();
                        } else {
                            System.out.println("Access denied. Admin login required.");
                        }
                        break;
                    case 5:
                        if (isAdmin) {
                            removeStudent();
                        } else {
                            System.out.println("Access denied. Admin login required.");
                        }
                        break;
                    case 6:
                        displayAllStudents();
                        break;
                    case 7:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                }
            } while (choice != 7);
        }

        private static void displayMenu(boolean isAdmin) {
            System.out.println("\nOptions:");
            if (!isAdmin) {
                System.out.println("1. Admin Login");
            } else {
                System.out.println("1. Admin Operations");
            }
            System.out.println("2. Add a new student");
            System.out.println("3. Search for a student by ID");
            System.out.println("4. Update student details");
            System.out.println("5. Remove a student");
            System.out.println("6. Display all students");
            System.out.println("7. Exit the program");
        }

        private static void addStudent() {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student grade: ");
            String grade = scanner.nextLine();
            System.out.print("Enter student contact number: ");
            String contactNumber = scanner.nextLine();
            system.createStudent(new Student(id, name, age, grade, contactNumber));
        }

        private static void searchStudent() {
            System.out.print("Enter student ID to search: ");
            int id = scanner.nextInt();
            system.searchStudent(id);
        }

        private static void updateStudent() {
            System.out.print("Enter student ID to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter new grade: ");
            String grade = scanner.nextLine();
            System.out.print("Enter new contact number: ");
            String contactNumber = scanner.nextLine();
            system.updateStudent(id, new Student(id, name, age, grade, contactNumber));
        }

        private static void removeStudent() {
            System.out.print("Enter student ID to remove: ");
            int id = scanner.nextInt();
            system.removeStudent(id);
        }

        private static void displayAllStudents() {
            system.displayAllStudents();
        }

        private static boolean adminLogin() {
            System.out.println("Admin Login");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
                System.out.println("Login successful. Welcome, Admin!");
                return true;
            } else {
                System.out.println("Invalid credentials. Please try again.");
                return false;
            }
        }

        private static void adminOperations() {
            int adminChoice;
            do {
                displayAdminMenu();
                System.out.print("Enter your choice: ");
                adminChoice = scanner.nextInt();
                scanner.nextLine();
                switch (adminChoice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        removeStudent();
                        break;
                    case 3:
                        updateStudent();
                        break;
                    case 4:
                        displayAllStudents();
                        break;
                    case 5:
                        System.out.println("Exiting admin mode...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } while (adminChoice != 5);
        }

        private static void displayAdminMenu() {
            System.out.println("\nAdmin Options:");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Update student details");
            System.out.println("4. Display all students");
            System.out.println("5. Exit admin mode");
        }
    }
