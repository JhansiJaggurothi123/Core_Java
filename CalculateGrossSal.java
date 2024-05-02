/*Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross     salary according to following:
    BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
    BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
    BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
    */
import java.util.Scanner;
public class CalculateGrossSal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary:");
        int bs=sc.nextInt();
        float hra,da;
        if(bs<=10000)
        {
            hra = bs*0.2f;
            da = bs*0.8f;
        }
        else if(bs<=20000)
        {
            hra = bs*0.25f;
            da = bs*0.9f;
        }
        else
        {
            hra = bs*0.3f;
            da = bs*0.95f;
        }
        System.out.println("Gross Salary : "+(bs+hra+da));

    }
}