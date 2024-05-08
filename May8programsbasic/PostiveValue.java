//Write a program to initialize a boolean variable and print it's opposite value on console.
//  Sample Input: true
//  Expected Output: false
import java.util.Scanner;
public class PostiveValue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean();
        boolean oppositeValue = !value;
        System.out.println("Opposite value: " + oppositeValue);
    }
}
