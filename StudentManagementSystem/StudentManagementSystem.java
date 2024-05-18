package StudentManagementSystem;
import java.util.ArrayList;
public class StudentManagementSystem  {
        private ArrayList<Student> students=new ArrayList<>();
        public StudentManagementSystem() {
        }
        public void createStudent(Student student) {
            students.add(student);
            System.out.println("Student added successfully.");
        }
        public void removeStudent(int studentId) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudid() == studentId) {
                    students.remove(i);
                    System.out.println("Student removed successfully.");
                    return;
                }
            }
            System.out.println("Student not found.");
        }
        public void searchStudent(int studentId) {
            for (Student student : students) {
                if (student.getStudid() == studentId) {
                    System.out.println("Student found:");
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student not found.");
        }
        public void displayAllStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found.");
            } else {
                System.out.println("All Students:");
                for (Student student : students) {
                    System.out.println(student);
                }
            }
        }
        public void updateStudent(int studentId, Student updatedStudent) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudid() == studentId) {
                    students.set(i, updatedStudent);
                    System.out.println("Student details updated successfully.");
                    return;
                }
            }
            System.out.println("Student not found.");
        }
    }


