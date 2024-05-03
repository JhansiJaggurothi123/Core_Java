import java.util.*;
public class SubTwoMatrix{
    public static void main(String[] args){
        int arr1[][]={{1,8,4},{9,7,2},{7,6,4}};
        int arr2[][]={{2,3,4},{6,9,8},{12,45,6}};
        int sub[][]=new int[3][3];
        System.out.println("Original Array:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                sub[i][j]=arr1[i][j]-arr2[i][j];
                System.out.print(" "+sub[i][j]);
            }
            System.out.println();
        }
    }
}