//Write a JAVAprogram to print all natural numbers from 1 to n. - using while loop reverse
import java.util.Scanner;
public class NaturalNumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        while (a>=b) {
            System.out.print(" " + a);
            a--;
        }
    }
}