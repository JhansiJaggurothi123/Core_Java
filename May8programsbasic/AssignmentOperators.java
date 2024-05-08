//4) Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
//     1. a*= b
//     2. a-= b
//     3. a/= b
//     4. a%= b
import java.util.*;
public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter the secound number");
        int b=sc.nextInt();
        a *= b;
        System.out.println(" a *= b: " + a);
       // a = 10;
        a -= b;
        System.out.println("a -= b: " + a);
       // a = 10;
        a /= b;
        System.out.println(" a /= b: " + a);
      //  a = 10;
        a %= b;
        System.out.println(" a %= b: " + a);
    }
}
