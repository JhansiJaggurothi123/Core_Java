import java.util.*;
public class CopyofElements{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int copy[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++) {
            System.out.print(" " + arr[i]);
          //  System.out.println("Copy array:");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++) {
            System.out.print(" "+copy[i]);
        }
    }
}