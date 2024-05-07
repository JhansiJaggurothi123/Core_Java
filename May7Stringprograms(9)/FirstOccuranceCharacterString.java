//Find First Occurrence of a Character in a Given String
//Scenario: You are developing a text editor.
// The user enters a paragraph, and you need to find the first occurrence of a particular character to highlight it.
import java.util.*;
public class FirstOccuranceCharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String s=sc.nextLine();
        System.out.println("Enter the character :");
        char ch=sc.nextLine().charAt(0);
        int FirstIndex = 0;
        FirstIndex = s.indexOf(ch);
        System.out.println("The first index of character a in the string: "+FirstIndex);
    }
}


