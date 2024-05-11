package oopsPrograms;
import java.util.*;
public class EncapsulationExample {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter age: ");
	        Person person=new Person();
	        int ageInput = sc.nextInt();
	        person.setAge(ageInput);
	        System.out.println("Your age: " + person.getAge());
	    }
	}



