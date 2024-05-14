package oops1;
import java.util.*;
public class StudentMain {
    public static void main(String[] args) {
        Student[] s= new Student[3];
        s[0] = new Student(1, "Alice", new int[]{90, 85, 88});
        s[1] = new Student(2, "Bob", new int[]{78, 92, 85});
        s[2] = new Student(3, "Charlie", new int[]{85, 80, 75});
        System.out.println("Student Information:");
        for (Student student : s) {
            student.display();
        }
    }
}
