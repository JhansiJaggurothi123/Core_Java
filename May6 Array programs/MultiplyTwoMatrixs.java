//Matrix Multiplication:
// Write a program to take two 2D arrays as input and perform matrix multiplication.
// Display the resulting matrix.
import java.util.*;
public class MultiplyTwoMatrixs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:of rows :");
        int r = sc.nextInt();
        System.out.println("Enter no:of columns:");
        int c = sc.nextInt();
        int i=0;
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int multi[][] = new int[r][c];
        System.out.println("Enter First Matrix elements");
        for ( i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println("Enter Second Matrix elements");
            for (i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("Addition of 2 matrix");
            for (i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    multi[i][j] = a[i][j] * b[i][j];
                }
            }
            for ( i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    System.out.print(" " + multi[i][j]);

                }
            }
        }
    }
}