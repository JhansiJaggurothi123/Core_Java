//Write a JAVAprogram to print all ASCII character with their values.
import java.util.Scanner;
public class PrintAsciivalues{
public static void main(String[] args){
            int i;

            for(i = 0; i <= 255; i++)
            {
                System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
            }
        }
    }
