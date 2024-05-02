//Write a JAVAprogram to find sum of first and last digit of a number.
import java.util.Scanner;
public class SumofFirstNumAndLastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int first_num, last_num;
        first_num = n;
        while (first_num >= 10) {
            first_num = first_num / 10;
        }
        last_num= n% 10;
        System.out.println("First digit:"+first_num);
        System.out.println("Last digit:"+last_num);
        System.out.println("sum of firstNum and LastNum:"+(first_num+last_num));
    }
}