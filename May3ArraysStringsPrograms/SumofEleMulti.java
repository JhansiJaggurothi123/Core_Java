import java.util.*;
public class SumofEleMulti{
    public static void main(String[] args){
        int arr[][]={{1,8,4},{9,7,2},{7,6,4}};
        int sum=0;
        System.out.println("Original Array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            System.out.println(" sum of the array:"+sum);
        }
    }
}