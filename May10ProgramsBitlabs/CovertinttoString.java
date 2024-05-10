package strings;
import java.util.*;
public class CovertinttoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String str=String.valueOf(n);
        if(str.length()>2) {
            char ch=str.charAt(2);
            System.out.println("character of index 2   "+":"  +ch);
        }else
            System.out.println("String is less than 3 cannot  print");
    }
}
