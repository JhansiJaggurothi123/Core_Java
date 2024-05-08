// Write a program to print the sum of two numbers without using + operator.
//    Sample Input:
//    Enter first number:
//    22
//    Enter second number:
//    50
import java.util.Scanner;

public class WithoutUsingPlusOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);
        System.out.println("The sum of two numbers is: " + sum);
    }
}

