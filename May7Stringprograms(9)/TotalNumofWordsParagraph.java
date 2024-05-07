// Assignment: Count Total Number of Words in a String
//Scenario: You are developing a word count application. The user inputs a paragraph, and you need to count the total number of words in the paragraph to help them with their writing.
import java.util.*;
public class TotalNumofWordsParagraph {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph=sc.nextLine();
        int total=0;
        for(int i=0;i<paragraph.length();i++){
            if(paragraph.charAt(i)==' ' && paragraph.charAt(i)!=' ')
                total++;
        }
        System.out.println("total number of words : "+total);
    }
}