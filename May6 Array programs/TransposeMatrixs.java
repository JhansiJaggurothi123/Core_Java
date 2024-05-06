// Transpose of a Matrix:
// Write a program to take a 2D array as input and find its transpose.
// Display the original and transposed matrices.
import java.util.*;
public class TransposeMatrixs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:of rows :");
        int r = sc.nextInt();
        System.out.println("Enter no:of columns:");
        int c = sc.nextInt();
        int original[][]=new int[r][c];
        int trans[][] = new int[r][c];
        System.out.println("Enter  Matrix elements");
        for (int  i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 original[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                System.out.print(" " +original[i][j]);
            }
            System.out.println();
        }
        System.out.print(" Printing Matrix after Transpose:");
        System.out.println();
        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                trans[i][j]=original[j][i];
                System.out.print(" "+trans[i][j]);
            }
            System.out.println();
        }
    }


}