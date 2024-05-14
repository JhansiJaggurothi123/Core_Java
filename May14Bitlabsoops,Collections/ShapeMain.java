package oops;
import java.util.*;
public class ShapeMain {
    public static void main(String[] args) {
        // Creating objects of each subclass
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);
        RightTriangle rightTriangle = new RightTriangle(3, 4);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Right Triangle Area: " + rightTriangle.area());
        System.out.println("Right Triangle Perimeter: " + rightTriangle.perimeter());
        Shape[] shapes = {circle, rectangle, triangle, rightTriangle};
        System.out.println("\nShapes Information:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}
