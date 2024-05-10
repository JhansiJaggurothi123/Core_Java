package oops;
import java.util.*;
public class NumberConversion {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number:");
        int num=sc.nextInt();
        String binary=Integer.toBinaryString(num);
        String octal=Integer.toOctalString(num);
        String hex=Integer.toHexString(num);
        System.out.println("Binary equvivalent :"+binary);
        System.out.println("Octal equvivalent:"+octal);
        System.out.println("hexadecimal equvilant:"+hex);

    }
}
