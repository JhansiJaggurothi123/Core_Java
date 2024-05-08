//1) Write a program to perform the below actions and print the result.
//     1. Difference of 2 numbers (30 and 10)
//     2. Product of 2 numbers (45 and 2)
//     3. Division of 2 numbers (600 and 10)
//     4. Increment and Decrement the number (15)
//     5. Remainder of 2 numbers (14 and 5)
//     Prompt the user input from the terminal.
import java.util.*;
public class Printtheresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int difference = a - b;
        System.out.println("Difference of " + a+ " and " + b+ ": " + difference);
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + ": " + product);
        int division = a / b;
        System.out.println("Division of " + a+ " and " + b+ ": " + division);
        int num = 15;
        int increment = num + 1;
        int decrement = num - 1;
        System.out.println("Increment of 15: " + increment);
        System.out.println("Decrement of 15: " + decrement);
        int remainder = a % b;
        System.out.println("Remainder of " + a+ " and " + b + ": " + remainder);

    }
    }