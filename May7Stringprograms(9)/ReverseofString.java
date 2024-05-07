// Assignment: Find Reverse of a String
//Scenario: You are creating a string utility function.
// The user provides a string, and you need to find its reverse to perform further operations on it.
import java.util.*;
public class ReverseofString{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        String rev = "";
        System.out.println("Reverse of a String");
        for (int i = s.length()-1; i >=0 ; i--)
            rev=rev+s.charAt(i);
        System.out.println(rev);
    }
}

