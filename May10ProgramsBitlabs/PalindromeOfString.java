package strings;
import java.util.*;
public class PalindromeOfString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        String palindrom="";
        for(int i=str.length()-1;i>=0;i--){
            palindrom+=str.charAt(i);
        }
        if(str.equals(palindrom))
            System.out.println(palindrom+ " is a Palindrome");
        else
            System.out.println(palindrom+" Not a palindrome");
    }
}
