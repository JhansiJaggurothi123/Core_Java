// Count Total Number of Negative Elements in an Array:
//// Write a program to count the total number of negative elements in an array and display the count
import java.util.Scanner;
class CountNegativeEleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int negcount=0;
        for(int num:arr){
            if(num<0)
                negcount++;
        }
        System.out.println("count negative numbers:"+negcount);
    }}