import java.util.*;
public class Occuranceofcharacter{
    public static void main(String[] args){
        String s1="Hello World";
        char ch='l';
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==ch)
                count++;
        }
        System.out.println("Occurance of each "+ch+" =  "+count);
    }
}