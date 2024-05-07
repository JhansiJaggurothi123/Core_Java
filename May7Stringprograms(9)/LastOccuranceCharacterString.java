//Assignment: Find Last Occurrence of a Character in a Given String
//Scenario: You are building a log analyzer.
// The user provides a log file, and you need to find the last occurrence of a specific character to identify the end of the log.
import java.util.*;
public class LastOccuranceCharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String s=sc.nextLine();
        System.out.println("Enter the character :");
        char ch=sc.nextLine().charAt(0);
        int strLastIndex = 0;
        strLastIndex = s.lastIndexOf(ch);
        System.out.println("The last index of character a in the string: "+strLastIndex);
    }
}


