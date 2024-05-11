package oopsPrograms;
public class Teachers {
	    protected String designation = "Teacher"; 
	    protected String collegeName = "IIT";
	    protected void work() {
	        System.out.println("Teaching");
	    }
	}
	class MathTeacher extends Teachers {
	}   
	class EnglishTeacher extends Teachers {

	}
	class MusicTeacher extends Teachers {

	}


