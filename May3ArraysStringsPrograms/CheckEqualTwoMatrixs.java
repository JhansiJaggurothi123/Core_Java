import java.util.*;
public class CheckEqualTwoMatrixs{
    public static void main(String[] args){
        int arr1[][]={{1,8,4},{9,7,2},{7,6,4}};
        int arr2[][]={{2,3,4},{6,9,8},{12,45,6}};
        boolean flag=true;
        int r1=arr1.length;
        int c1=arr1.length;
        int r2=arr2.length;
        int c2=arr2.length;
        if(r1!=r2 || c1!=c2){
            System.out.println("Matrixs are not equal");
        }
        else
        {
        for(int i=0;i<r1;i++) {
            for (int j = 0; j < c1; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Matrixs are equal");
        else
            System.out.println("Matrixs are not equal");
        }
    }
}