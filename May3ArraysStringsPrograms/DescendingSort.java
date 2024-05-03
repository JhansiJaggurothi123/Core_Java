import java.util.*;
public class DescendingSort {
    public static void main(String[] args) {
        int arr[] = {12,56,889,23,1};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("After sorting:");
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(" " + arr[i]);
        }

    }
}
