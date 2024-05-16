package studentRegistrationForm;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentRegistration {
    private static HashMap<String, String[]> users = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    signUp();
                    break;
                case "2":
                    signIn();
                    break;
                case "3":
                    System.out.println("Exiting program.");
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void signUp() {
        System.out.println("Please enter the following details to sign up:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Contact :");
        String contact = scanner.nextLine();
        System.out.print("Email :");
        String email = scanner.nextLine();
        System.out.print("Father's Name :");
        String fathername = scanner.nextLine();
        users.put(username, new String[]{password});
        System.out.println("Sign up successful!");
    }
    public static void signIn() {
        System.out.println("Please enter your username and password to sign in:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        if (!users.containsKey(username)) {
            System.out.println("Username not found. Please sign up first.");
            return;
        }
        System.out.print("Password: ");
        String password = scanner.nextLine();
        String[] userDetails = users.get(username);
        if (!userDetails[0].equals(password)) {
            System.out.println("Incorrect password. Please try again.");
            return;
        }
        System.out.println("Sign in successful!");
    }
}







