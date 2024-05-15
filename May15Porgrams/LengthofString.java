package strings;
import java.util.*;
public class LengthofString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println("length of the String 1  ;" + s1.length());
        System.out.println("length of the String  2 ;" + s2.length());
        System.out.println("Compare two strings");
        if (s1.equals(s2)) {
            System.out.println("EQUAL ");
        } else
            System.out.println("Not Equal");
        String s3 = s1 + s2;
        System.out.println("Concate of two strings :"+s3);
    }
}