package strings;
import java.util.*;
public class HighestFrequencyofCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int freq[] = new int[str.length()];
        char maxchar = str.charAt(0);
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
            int max = freq[0];
            for (int i = 0; i < freq.length; i++) {
                if (max < freq[i]) {
                    max = freq[i];
                    maxchar = String[i];
                }
            }
            System.out.println("Highest Frequency Occurance:"+maxchar);
        }
    }
