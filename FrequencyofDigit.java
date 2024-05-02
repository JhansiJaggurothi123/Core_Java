//Write a JAVAprogram to find frequency of each digit in a given integer.
import java.util.*;
class FrequencyofDigit
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,count,digit,temp;
        System.out.println("Enter any Number : ");
        n=sc.nextInt();
        System.out.println("Digit\tFrequency");
        for(i=0;i<=9;i++)
        {
            count=0;
            temp=n;
            while(temp>0)
            {
                digit=temp%10;
                if(digit==i)
                {
                    count++;
                }
                temp=temp/10;
            }
            if(count>0)
            {
                System.out.println(i+"\t"+count);
            }
        }
    }
}
