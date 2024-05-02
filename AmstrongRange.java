//Write a JAVAprogram to print all Armstrong numbers between 1 to n.
import java.util.Scanner;
public class AmstrongRange {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       // System.out.println("Enter number:");
      //  int n=sc.nextInt();
        int n,r;
        for(int i=1;i<=10000;i++) {
            n=i;
            int sum=0;
            while (n> 0) {
                r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }
            if (sum == i) {
                System.out.print("  " + i);
            }
        }
    }
}