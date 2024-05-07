//Find Total Number of Alphabets, Digits, or Special Characters in a String
//Scenario: You are developing a program for a password strength checker. The user inputs a password, and you need to count the total number of alphabets, digits, and special characters present in the password to assess its strength.
import java.util.*;
public class PasswordChecker{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password:");
        String password=sc.nextLine();
        int Alpha=0,digit=0,specialch=0;
        for(char ch:password.toCharArray()){
            if(Character.isAlphabetic(ch))
                Alpha++;
            else if (Character.isDigit(ch))
                digit++;
            else
                specialch++;
        }
        System.out.println("Number of Alphabets :"+Alpha);
        System.out.println("Number of Digits :"+digit);
        System.out.println("Number of Special characters :"+specialch);
    }
}