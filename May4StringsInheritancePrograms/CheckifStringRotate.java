import javax.swing.*;
import java.util.*;
public class CheckifStringRotate{
    public static void main(String[] args){
        String s1="ABCD";
        String s2="CDBA";
        if(s1.length()!=s2.length())
            System.out.println("its not a rotational");
        String s3=s1+s2;
        if(s3.indexOf(s2)!=-1)
            System.out.println("String rotational");
        else
            System.out.println("not a Rotational");

    }
}