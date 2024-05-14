package collections;
import java.util.*;
import java.util.ArrayList;
public class ToSearchAnElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements to enter:");
        ArrayList<String>original=new ArrayList<>();
        int size=sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i <size; i++) {
            original.add(sc.nextLine());
        }
        System.out.println(original);
        System.out.print("Enter Search Element: ");
        String searchElement = sc.nextLine();
        if (original.contains(searchElement)) {
            System.out.println(searchElement + "  is present.");
        } else {
            System.out.println(searchElement + " is not present.");
        }
    }
    }

