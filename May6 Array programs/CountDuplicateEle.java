//Count Total Number of Duplicate Elements in an Array:
// Write a program to count the total number of duplicate elements in an array and display the count.
import java.util.Scanner;
class CountDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dupcount=0;
        for(int i=0;i<size;i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j])
                    dupcount++;
            }
        }
        System.out.println("count duplicate elements:"+dupcount);
    }
}