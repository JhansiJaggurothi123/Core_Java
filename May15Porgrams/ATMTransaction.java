package Numbers;
import java.util.*;
public class ATMTransaction {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();
            boolean continueTransaction = true;
            while (continueTransaction) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful. Current balance: " + balance);
                        }
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        balance += depositAmount;
                        System.out.println("Deposit successful. Current balance: " + balance);
                        break;
                    case 3:
                        System.out.println("Current balance: " + balance);
                        break;
                    case 4:
                        System.out.println("Exiting ATM. Thank you!");
                        continueTransaction = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                        break;
                }
            }
        }
    }


