// Write a JAVAprogram to find sum of all prime numbers between 1 to n.
import java.util.Scanner;
public class SumofPrimeNum {
    public static void main(String[] args) {
        int n = 100, sum=0;
        for (int i = 2; i <= 100; i++) {
            int count=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count==0 && n!=1) {
                sum=sum+n;
                System.out.print(" " + sum);
            }
            }
        }
    }