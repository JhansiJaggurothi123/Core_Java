package strings;
import java.util.*;
public class SubstringofString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=sc.nextLine();
        System.out.println("Enter the substring");
        String sub=sc.nextLine();
       if(input.contains(sub))
       System.out.println("String is found");
       else
           System.out.println("String is not found");

    }}
