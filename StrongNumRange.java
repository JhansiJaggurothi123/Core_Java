// Write a JAVAprogram to print all Strong numbers between 1 to n.
import java.util.Scanner;
public class StrongNumRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int n=i, sum = 0, r, fact = 1;
            while (n > 0) {
                r = n % 10;
                n = n / 10;
                for (int j = 1; j < r; j++) {
                    fact = fact * j;
                }
                sum = sum + fact;
            }
            if (sum == i)
                System.out.println(" "+i);
        }
    }
}