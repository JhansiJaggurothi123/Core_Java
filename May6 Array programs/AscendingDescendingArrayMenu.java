import java.util.Arrays;
import java.util.Scanner;
class AscendingDescendingArrayMenu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("choose Sorting order:");
        System.out.println("choose 1 : Ascending");
        System.out.println("Choose 2 : Descending");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        if(choice==1){
            Arrays.sort(arr);
            System.out.println("elements Ascending order");
        }
        else if(choice==2) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("elements in Descending order:");
        }
        else
            System.out.println("invalid choice");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();


    }
}
