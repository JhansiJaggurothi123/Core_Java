package strings;
import java.util.*;
public class WithoutUsingSubstringMethod {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            System.out.print("Enter search string: ");
            String sb = scanner.nextLine();
            if (findSubstring(str,sb)) {
                System.out.println(sb + " is found.");
            } else {
                System.out.println(sb + " is not found.");
            }
        }
        public static boolean findSubstring(String str, String sb) {
            int strlength = str.length();
            int subLength = sb.length();
            for (int i = 0; i <= strlength - subLength; i++) {
                for (int j = 0; j < subLength; j++) {
                    if (str.charAt(i + j) != sb.charAt(j)) {
                        break;
                    }

                    if (j == subLength) {
                        return true;
                    }
                }
            }
            return false;
        }
    }


