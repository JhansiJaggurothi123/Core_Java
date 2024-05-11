package oopsPrograms;
import java.util.*;
public class TeachersMain {
	public static void main(String[] args) {
		 MathTeacher mathTeacher = new MathTeacher();
	        EnglishTeacher englishTeacher = new EnglishTeacher();
	        MusicTeacher musicTeacher = new MusicTeacher();
	        System.out.println("Math Teacher\t\t" + mathTeacher.collegeName);
	        System.out.println("English Teacher\t\t" + englishTeacher.collegeName);
	        System.out.println("Music Teacher\t\t" + musicTeacher.collegeName);

	        // Calling method using child class objects
	        mathTeacher.work();
	        englishTeacher.work();
	        musicTeacher.work();

	}

}
