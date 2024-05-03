import java.util.*;
public class EvenPositionArray{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        for(int i=1;i<arr.length;i+=2){
            System.out.print(" "+arr[i]);
        }
    }

}