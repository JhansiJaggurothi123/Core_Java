//Count Total Number of Even and Odd Elements in an Array:
// Write a program to count the total number of even and odd elements in an array and display the counts.
import java.util.Scanner;
class CountEveOddEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Evecount=0,Oddcount=0;
        for(int num:arr)
        {
            if(num%2==0)
                Evecount++;
            else
                Oddcount++;
        }
        System.out.println("Total number of even elements in the array: " + Evecount);
        System.out.println("Total number of odd elements in the array: " + Oddcount);

    }
}