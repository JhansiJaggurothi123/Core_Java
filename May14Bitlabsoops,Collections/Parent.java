package oops;
public class Parent {
    Parent(){
        System.out.println("Parent class is a default constructor");
    }
    Parent(int x){
        this();
        System.out.println("Parent class is a one-argument ");
    }
}
class Child extends Parent{
    Child(){

        System.out.println("child class is a Default constructor");
    }
    Child(int x){
        super(x);
        System.out.println("Child class has one-argument");
    }
}
