package collections;
import java.util.*;
public class sortofArraylist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>original=new ArrayList<>();
        int size=sc.nextInt();
        System.out.println("Enter the numbers how many to enters");
        for (int i = 0; i <size; i++) {
            System.out.println(" Enter the number  "+i +":");
            original.add(sc.nextInt());
        }
        Collections.sort(original);
        System.out.println("sort of Arraylist");
        for(int val:original){
            System.out.print(val+" ");
        }
    }

}
