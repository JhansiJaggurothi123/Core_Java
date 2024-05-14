package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CopyRemoveDuplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> original=new ArrayList<>();
        System.out.println("Enter how many numbers to enter:");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(" Enter the number  "+i +":");
            original.add(sc.nextInt());
        }
        HashSet<Integer>uniqueset=new HashSet<>(original);
        System.out.println("copy with duplicate elements:");
        for(int val:uniqueset){
            System.out.println(val);
        }
    }
}
