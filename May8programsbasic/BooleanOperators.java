// Print the results for the following statements considering x = true and y = false.
//             1. x&&y
//             2. x||y
//             3. !x
//             4. !y
import java.util.Scanner;
public class BooleanOperators{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x as boolean value (true/false): ");
        boolean x = scanner.nextBoolean();
        System.out.println("Enter y as boolean value (true/false): ");
        boolean y = scanner.nextBoolean();
        boolean result_1 = x && y;
        boolean result_2 = x || y;
        boolean result_3 = !x;
        boolean result_4 = !y;
        System.out.println("1. x && y = " + result_1);
        System.out.println("2. x || y = " + result_2);
        System.out.println("3. !x     = " + result_3);
        System.out.println("4. !y     = " + result_4);
    }
}

