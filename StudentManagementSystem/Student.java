package StudentManagementSystem;
public class Student {
    private int studId;
    private String name;
    private int age;
    private String grade;
    private String contactNumber;
    Student(int studId,String name,int age,String grade,String contactNumber){
        this.studId=studId;
        this.age=age;
        this.contactNumber=contactNumber;
        this.name=name;
        this.grade=grade;
    }
    public int getStudid(){
        return studId;
    }
    public String getName(){
        return name;
    }
    public String getContactNumber(){
        return contactNumber;
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }
    public void setStudId(int studId){
        this.studId=studId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public String toString(){
        return "StudentId:"+studId +"StudentName:"+name+"StudentAge:"+age+"StudentContactNum:"+contactNumber+"StudentGrade:"+grade;
    }
}
