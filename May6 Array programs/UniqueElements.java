// Print All Unique Elements in the Array: Write a program to print all unique elements
import java.util.Scanner;
class UniqueElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            boolean isUnique=true;
            for(int j=0;j<size;j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
            System.out.print(" "+arr[i]);
        }
    }
}