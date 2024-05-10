package oops;
import java.util.*;
public class Datamember {
    int id;
    String name;
    static  String college_Name="ABC ";
    public Datamember(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void student(){
        System.out.println("Student name:"+name);
        System.out.println("Student id  :"+id);
        System.out.println("College name:"+college_Name);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the student id: ");
        int id = scanner.nextInt();
        Datamember m1=new Datamember(id,name);
        m1.student();



    }
}
