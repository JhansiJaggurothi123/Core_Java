// Count Frequency of Each Character in a String
//Scenario: You are implementing a text analysis tool for language processing.
// The user enters a paragraph, and you need to count the frequency of each character to generate a statistical analysis of the text.
import java.util.*;
public class FrequencyCharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String str= sc.nextLine();
        int freq[] = new int[str.length()];
        char ch[] = str.toCharArray();
        char string[] = str.toCharArray();

        for(int i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        System.out.println("Characters and their corresponding frequencies");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
}
    }
