package oops1;
public class MathOperationsMain {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        // Testing addition methods
        System.out.println("Addition:");
        System.out.println("Integer: " + math.add(5, 3));
        System.out.println("Double: " + math.add(5.5, 3.2));
        System.out.println("Float: " + math.add(5.5f, 3.2f));
        System.out.println("\nMultiplication:");
        System.out.println("Integer: " + math.multiply(5, 3));
        System.out.println("Double: " + math.multiply(5.5, 3.2));
        System.out.println("Float: " + math.multiply(5.5f, 3.2f));
        System.out.println("\nSubtraction:");
        System.out.println("Integer: " + math.subtraction(5, 3));
        System.out.println("Double: " + math.subtraction(5.5, 3.2));
        System.out.println("Float: " + math.subtraction(5.5f, 3.2f));
    }
    }
