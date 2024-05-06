// Search Element in Array:
// Write a program to take an array and a key element as input. Search for the key element in the array and display its position/index if found, otherwise display "Element not found."
import java.util.Scanner;
class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key element:");
        int key = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                flag = 1;
                break;
            } else
                flag = 0;
            if (flag == 1)
                System.out.println("Search element in Array" + (i + 1));
            else
                System.out.println("Elements not found");
        }

    }
}