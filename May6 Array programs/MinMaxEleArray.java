//Find Maximum and Minimum Element in an Array:
// Write a program to find the maximum and minimum elements in an array and display both.
import java.util.Scanner;
class MinMaxEleArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Maximum element is:"+max);
        System.out.println("Minimun element is :"+min);
    }
}