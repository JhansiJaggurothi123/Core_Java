import java.util.*;
public class MultiplyTwoMatrixs{
    public static void main(String[] args){
        int arr1[][]={{1,8,4},{9,7,2},{7,6,4}};
        int arr2[][]={{2,3,4},{6,9,8},{12,45,6}};
        int mul[][]=new int[3][3];
        System.out.println("Original Array:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                mul[i][j]=arr1[i][j]*arr2[i][j];
                System.out.print(" "+mul[i][j]);
            }
            System.out.println();
        }
    }
}