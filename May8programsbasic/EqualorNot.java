//2) Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
//    1. 30 and 20
//    2. 20 and 20
//    3. 20 and 30
//    Prompt the user input from the terminal.
import java.util.*;
public class EqualorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if (a == b)
            System.out.println( a + " and " + b + " are equal.");
         else
            System.out.println(a + " and " + b+ " are not equal.");

    }
}