//Assignment: Count Occurrences of a Character in Given String
//Scenario: You are implementing a character counting utility.
// The user inputs a sentence, and you need to count the occurrences of a particular character to provide a usage report.
import java.util.*;
 public class CountOccuranceCharacter {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the sentence:");
         String sentence=sc.nextLine();
         System.out.println("Enter character ");
         char ch=sc.nextLine().charAt(0);
         int count=0;
         for(int i=0;i<sentence.length();i++){
             if(sentence.charAt(i)==ch)
                 count++;
         }
         System.out.println("All occunrance of character :"+count);
     }
}
