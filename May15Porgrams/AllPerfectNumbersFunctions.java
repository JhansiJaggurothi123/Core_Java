package Numbers;
import java.util.*;
public class AllPerfectNumbersFunctions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the last number:");
        int b=sc.nextInt();
        System.out.println("PerfectNUmbers bewtween " +a +"------" +b);
        perfectNumbers(a,b);
    }
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
    static void perfectNumbers(int a,int b){
        for(int i=a;i<=b;i++){
            if(isPerfect(i))
                System.out.print(" "+i);
        }
    }
}
