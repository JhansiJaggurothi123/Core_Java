package collections;
import java.util.*;
import java.util.ArrayList;

public class ReverseofArrayList {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers how many to enters");
        ArrayList<Integer> original=new ArrayList<>();
        int size=sc.nextInt();
        for (int i = 0; i <size; i++) {
            System.out.println(" Enter the number  "+i +":");
            original.add(sc.nextInt());
        }
        Collections.reverse(original);
        System.out.println("Reverse of Arraylist");
        for(int val:original){
            System.out.print(val+" ");
        }

    }
}
