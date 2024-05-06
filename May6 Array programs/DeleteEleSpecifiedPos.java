//Delete an Element from an Array at Specified Position:
// Write a program to delete an element from an array at a specified position and display the updated array.
import java.util.Scanner;
class DeleteEleSpecifiedPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position :");
        int pos=sc.nextInt();
        if(pos<0 || pos>=size)
            System.out.println("invalid position");
        for(int i=pos;i<size-1;i++){
           arr[i]=arr[i+1];
        }
        size--;
        System.out.println("Updated array after delete");
        for(int i=0;i<size;i++){
            //System.out.println("Updated array after delete");
            System.out.print(" "+arr[i]);
        }
    }
}