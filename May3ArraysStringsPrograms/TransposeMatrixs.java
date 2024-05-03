import java.util.*;
public class TransposeMatrixs {
    public static void main(String[] args) {
        int arr1[][] = {{1, 8, 4}, {9, 7, 2}, {7, 6, 4}};
        int trans[][] = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                trans[i][j] = arr1[j][i];
            }
        }
        System.out.println("Original Array:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" " +arr1[i][j]);
            }
            System.out.println();
        }
        System.out.print(" Printing Matrix after Transpose:");
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(" "+trans[i][j]);
            }
            System.out.println();
        }
    }


}