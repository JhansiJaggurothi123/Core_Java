import java.util.*;
public class CountNumofWords{
    public static void main(String[] args){
        String s1="java is a high level programming language";
        int count=0;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==' '&& Character.isLetter(s1.charAt(i+1))&&(i>0)){
                count++;
            }
        }
        count++;
       System.out.println("Num of Words ="+count) ;
    }
}