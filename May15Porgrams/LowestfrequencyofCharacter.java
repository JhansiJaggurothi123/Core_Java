package strings;
import java.util.*;
public class LowestfrequencyofCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int freq[] = new int[str.length()];
        char minchar = str.charAt(0);
        char String[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (String[i] == String[j] && String[i] != '0' && String[i] != ' ') {
                    freq[i]++;
                    String[j] = '0';
                }
            }
        }
        int min = freq[0];
        for (int i = 0; i < freq.length; i++) {
            if (min >freq[i] && freq[i]!='0') {
                min = freq[i];
                minchar = String[i];
            }
        }
        System.out.println("Highest Frequency Occurance:"+minchar);
    }
}


