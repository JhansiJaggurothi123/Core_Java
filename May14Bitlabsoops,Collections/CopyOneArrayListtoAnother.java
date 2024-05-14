package collections;
import java.util.Scanner;
import java.util.ArrayList;
public class CopyOneArrayListtoAnother {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer>copy=new ArrayList<>();
        System.out.println("Enter the how many numbers to enter: ");
        int size = sc.nextInt();
        System.out.println("Please Enter the number:");
        for (int i = 0; i < size; i++) {
            System.out.println(" Enter the number  "+i +":");
            original.add(sc.nextInt());
        }
        copy.addAll(original);
        System.out.println("copied list:");
        for(int value : original)
        {
            System.out.println(value);
        }
    }
}
