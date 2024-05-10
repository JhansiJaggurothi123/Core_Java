package oops;
import java.util.*;
    public class Student {
        static int roll_number = 1;
        String name;
        public Student(String name) {
            this.name = name;
            this.roll_number=roll_number;
        }
        public void display() {
            System.out.println("Roll no: " + roll_number++ + "  Name: " + name);
        }
        public static void main(String[] args) {
            Student student1 = new Student("Shree");
            Student student2 = new Student("Balaji");
            Student student3 = new Student("Ajay");
            student1.display();
            student2.display();
            student3.display();
        }
    }


