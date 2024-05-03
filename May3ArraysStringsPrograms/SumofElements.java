import java.util.*;
public class SumofElements{
    public static void main(String[] args) {
        int [] arr = {25, 11, 7, 75, 56};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("SumofElements: " +sum);
    }
}