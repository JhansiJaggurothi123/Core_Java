//Write a JAVAprogram to enter a number and print it in words.
import java.util.Scanner;
public class ConvertDigit_Word{
    private static final String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String convertNumberToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        if (num < 0) {
            return "minus " + convertNumberToWords(-num);
        }

        if (num < 10) {
            return units[num];
        }

        if (num < 20) {
            return teens[num - 10];
        }

        if (num < 100) {
            return tens[num / 10] + ((num % 10 != 0) ? " " + convertNumberToWords(num % 10) : "");
        }

        if (num < 1000) {
            return units[num / 100] + " hundred" + ((num % 100 != 0) ? " and " + convertNumberToWords(num % 100) : "");
        }

        if (num < 1000000) {
            return convertNumberToWords(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " + convertNumberToWords(num % 1000) : "");
        }

        if (num < 1000000000) {
            return convertNumberToWords(num / 1000000) + " million" + ((num % 1000000 != 0) ? " " + convertNumberToWords(num % 1000000) : "");
        }

        return "Number too large to convert";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("In words: " + convertNumberToWords(number));
    }
}
