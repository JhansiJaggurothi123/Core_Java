package Numbers;
import java.util.*;
public class AllPrimeNumbersFunctions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start number:");
        int a=sc.nextInt();
        System.out.println("Enter the end number:");
        int b=sc.nextInt();
        System.out.println("Prime Numbers betweem"  +a +" ---------"+b);
        primeNumbers(a,b);
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void primeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(" "+i);

            }
        }
    }
}
