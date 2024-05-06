// Array Rotation:
// Write a program to rotate the elements of an array to the left by a given number of positions.
// Display the updated array rotation
import java.util.*;
public class LeftRotate{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=3;
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        //rotate element
        for(int i=0;i<n;i++){
            int j,first;
            first=arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println();
        System.out.println("After left rotate:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}