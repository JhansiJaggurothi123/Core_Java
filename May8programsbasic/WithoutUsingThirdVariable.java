//6) Write a program that swaps the values of 2 variables without using third variable.
//    Sample Input:
//    Enter first number:
//    12
//    Enter second number:
//    45
//    Expected Output:
//    Before swapping: 12 , 45
//    After swapping: 45 , 12
import java.util.Scanner;

public class WithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Before swapping: " + a + " , " + b);
        a = a + b;
        b = a- b;
        a= a- b;
        System.out.println("After swapping: " + a + " , " + b);
    }
}
