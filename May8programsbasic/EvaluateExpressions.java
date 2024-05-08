//Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
//     1. int b= a-- - --a;
//     2. int c=a--;
//     3. int d=a>>2;
//     4. int e=a&b;
import java.util.Scanner;

public class EvaluateExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first element:");
        int a= scanner.nextInt();
        System.out.println("Enter secound number:");
        int b= scanner.nextInt();
        int c,e,d;
        int result_1 = b = a-- - --a;
        int result_2 = c = a--;
        int result_3 = d = a >> 2;
        int result_4 = e = a & b;
        System.out.println(" int b = a-- - --a;   Result: " + result_1);
        System.out.println(" int c = a--;        Result: " + result_2);
        System.out.println("int d = a >> 2;     Result: " + result_3);
        System.out.println(" int e = a & b;      Result: " + result_4);

    }
}

