//Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off.
//  Allow user to input the marks from the terminal.
//  Sample Input:
//        maximum_marks=500
//        total_marks=348
import java.util.Scanner;
public class Percentagetotalmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum marks: ");
        int maximumMarks = scanner.nextInt();
        System.out.print("Enter the total marks obtained: ");
        int totalMarks = scanner.nextInt();
        double percentage = calculatePercentage(totalMarks, maximumMarks);
        System.out.println("Percentage = " + Math.round(percentage) + "%");
    }
    public static double calculatePercentage(int totalMarks, int maximumMarks) {
        return ((double) totalMarks / maximumMarks) * 100;
    }
}

