package strings;
import java.util.*;
public class BufferString {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String inputString = scanner.nextLine();
                String reversedString = reverseString(inputString);
                System.out.println("Reversing entire string: " + reversedString);
                String reversedWordsString = reverseEachWord(inputString);
                System.out.println("Reversing each word at its place: " + reversedWordsString);
            }
            public static String reverseString(String str) {
                StringBuffer sb = new StringBuffer(str);
                return sb.reverse().toString();
            }
            public static String reverseEachWord(String str)
            {
                String[] words = str.split("\\s+");
                StringBuilder reversedString = new StringBuilder();
                for (String word : words) {
                    StringBuilder reversedWord = new StringBuilder(word);
                    reversedString.append(reversedWord.reverse()).append(" ");
                }
                return reversedString.toString().trim();
            }
        }

