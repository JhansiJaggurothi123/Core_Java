package Numbers;
import java.util.*;
public class AllStrongNumbersFunctions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the last number:");
        int b=sc.nextInt();
        System.out.println("Amstrongnumver bewtween " +a +"------" +b);
        amstrongNumbers(a,b);
    }
        static boolean isArmstrong(int num) {
            int originalNum, lastDigit, sum = 0;
            originalNum = num;
            int digits = (int) Math.log10(num) + 1;
            while (num > 0) {
                lastDigit = num % 10;
                sum += Math.pow(lastDigit, digits);
                num /= 10;
            }
            return originalNum == sum;
        }
        static void amstrongNumbers(int a,int b){
        for(int i=a;i<=b;i++){
            if(isArmstrong(i))
                System.out.print(" "+i);
        }
        }
    }
