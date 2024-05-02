//Write a JAVAprogram to print all Perfect numbers between 1 to n.
import java.util.Scanner;
public class PerfectNumRange {
    public static void main(String[] args) {
        int n, sum = 0;
        for (int i = 1; i < 100; i++) {
            n = i;
            if (n % i == 0)
                sum = sum + i;
            if (sum == i)
                System.out.println(" "+i);
        }
    }
}