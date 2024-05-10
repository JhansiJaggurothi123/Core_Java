package oops;
import java.util.*;
public class StudentResult {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] rollNumbers = new int[3];
            String[] names = new String[3];
            double[][] marks = new double[3][5];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                System.out.print("Enter Roll Number: ");
                rollNumbers[i] = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Name: ");
                names[i] = scanner.nextLine();
                System.out.println("Enter marks for 5 subjects:");
                for (int j = 0; j < 5; j++) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    marks[i][j] = scanner.nextDouble();
                }
            }
            System.out.println("\n**** Results ****");
            for (int i = 0; i < 3; i++) {
                System.out.println("\nRoll Number: " + rollNumbers[i]);
                System.out.println("Name: " + names[i]);
                double percentage = calculatePercentage(marks[i]);
                System.out.println("Percentage: " + percentage + "%");
            }
        }
        public static double calculatePercentage(double[] marks) {
            double totalMarks = 0;
            for (double mark : marks) {
                totalMarks += mark;
            }
            return (totalMarks / (marks.length * 100)) * 100;
        }
    }


