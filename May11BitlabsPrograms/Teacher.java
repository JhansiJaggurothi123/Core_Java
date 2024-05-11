package oopsPrograms;
public class Teacher {
	    protected String designation = "ComputerTeacher";
	    protected String collegeName = "IIT"; 
	    protected void work() {
	        System.out.println("Teaching");
	    }
	}
	class ComputerTeacher extends Teacher {

}
