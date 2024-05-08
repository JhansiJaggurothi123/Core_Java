import java.util.Scanner;
import java.lang.Math;
public class CircumranceofCircle{

    public static void main(String[] args){
        double circumference, radius;
        Scanner sc=new Scanner (System.in);
        System.out.print(" radius of the circle: ");
        radius=sc.nextDouble();
        circumference= Math.PI*2*radius;
        System.out.println("circumference of the circle is: "+(int)circumference);
    }
}