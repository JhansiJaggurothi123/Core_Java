import java.util.*;
public class DivideStringNequal{
    public static void main(String[] args){
        String str="aaaabbbbcccc";
        int len=str.length();
        int temp=0,n=3, ch=len/n;
        //stroing the string
        String[] equal=new String[n];
        if(len%n!=0)
            System.out.println("Stirng can,t divided into equal parts: ");
        else
        {
            for(int i=0;i<len;i=i+ch){
                String part=str.substring(i,i+ch);
                equal[temp]=part;
                temp++;
            }
            System.out.println(n + " equal parts of given string are ");
            for(int i = 0; i < equal.length; i++) {
                System.out.println(equal[i]);
            }
        }
    }
}