import java.util.*;
public class CountVowCon{
    public static void main(String[] args){
        String s1="java is a high programming language";
        int vcount=0,Ccount=0;
        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i)=='o' || s1.charAt(i)=='i' || s1.charAt(i)=='u' ||s1.charAt(i)=='e')
                vcount++;
            else if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
                Ccount++;
        }
        System.out.println("Noof of vowels :"+vcount);
        System.out.println("noof of consonents:"+Ccount);
    }
}