//Print All Negative Elements in an Array: Write a program to take an array as input and print all negative elements present in the array.
import java.util.Scanner;
class PrintAllNegativEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("All negative numbers:");
        for (int n : arr) {
            if (n < 0) {
                System.out.print(n);
            }
        }
    }
}