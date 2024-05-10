package oops;
import java.util.*;
public class UsingStaticMethod {
    static  String Collage_Name;
    int roll_num;
    String name;
    static{
        Collage_Name="PVPSIT";
    }
    public UsingStaticMethod(int roll_num,String name){
        this.roll_num=roll_num;
        this.name=name;
    }
    public void display(){
        System.out.println("Student name:"+name);
        System.out.println("Student roll_num:"+roll_num);
        System.out.println("College name:"+Collage_Name);
    }
    public static void main(String[] args){
        UsingStaticMethod s1=new UsingStaticMethod(111,"jhansi");
        UsingStaticMethod s2=new UsingStaticMethod(222,"poojitha");
        s1.display();
        s2.display();


    }
}

