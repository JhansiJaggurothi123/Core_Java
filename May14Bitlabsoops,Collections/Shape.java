package oops;
abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}
class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    Triangle(double side1,double side2,double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height));
    }
}
