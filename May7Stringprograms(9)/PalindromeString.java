// Assignment: Check Whether a String is Palindrome or Not
//Scenario: You are implementing a word game.
// The player enters a word, and you need to check whether it is a palindrome (reads the same forward and backward) to determine their score.

import java.util.*;
public class PalindromeString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String s=sc.nextLine();
        String rev = "";
        for (int i = s.length()-1; i >=0 ; i--)
            rev=rev+s.charAt(i);
        if(s.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}