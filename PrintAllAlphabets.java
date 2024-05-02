// Write a JAVAprogram to print all alphabets from a to z. - using while loop
import java.util.Scanner;
public class PrintAllAlphabets {
    public static void main(String[] args) {
        char ch='a' ;
        while (ch<= 'z') {
            System.out.print(" " + ch);
            ch++;
        }
    }
}