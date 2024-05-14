package oops;
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sounds");
    }
}
class Horse extends Animal{
    public void makeSound(){
        System.out.println("The horse says:wee wee");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("The Cat says: meow ");
    }
}