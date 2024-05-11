package oopsPrograms;
import java.util.*;
public class BankMain {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        Bank account = new Bank();
	        System.out.print("Enter BankAccount Number: ");
	        long accountNumberInput = scanner.nextLong();
	        account.setAccountNum(accountNumberInput);
	        System.out.print("Enter Current Balance: ");
	        double accountBalanceInput = scanner.nextDouble();
	        account.setAccountBalance(accountBalanceInput);
    System.out.println("\nBankAccount Number: " + account.getAccountNum());
    System.out.println("Current Balance: " + account.getAccountBal());



	}

}
