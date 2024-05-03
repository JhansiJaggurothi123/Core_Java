import java.util.Scanner;
public class CheckCharacterspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("is an alphabet.");
        else if (ch >= '0' && ch <= '9')
            System.out.println("is a digit.");
         else
            System.out.println(" is a special character.");


    }
}