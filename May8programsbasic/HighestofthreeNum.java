//Write a program to find the highest among the given 3 numbers.
//   Prompt the user for the 3 numbers to be input from the terminal.
//   SampleInput:
//   Enter the first number: 11
//   Enter the second number: 22
//   Enter the third number: 1
import javax.swing.*;
import java.util.*;
public class HighestofthreeNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter secound number:");
        int b=sc.nextInt();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        if (a > b &&  a> b)
            System.out.println("The highest number is: "+a);
        else if (b > a && b > c)
            System.out.println("The highest number is: "+b);
        else if (c> a && c > b)
            System.out.println("The highest number is: "+c);
        else
            System.out.println("The numbers are same.");
    }
}
