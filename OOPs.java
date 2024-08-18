import java.util.Scanner;

// Object-Oriented Programming
// Object - Properties (data/data structures) & Behavior (methods/functions)
// Class

// how codes are run: JVM - (Stacks for each function) + a single heap for instance storage

/**
 * Calculator
 */

// Method Overloading: multiple methods of same name
// Method Overriding: situation in inheritance



class Calculator {
    int a; // instance variable (another thing is local variable)
    int b;

    // Constructor to initialize the values of a and b
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to add two numbers
    public int add() {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract() {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply() {
        return a * b;
    }

    // Method to divide two numbers
    public int divide() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0; // Return zero to indicate an error
        }
    }
}

public class OOPs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for a and b
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        // Creating an object of the Calculator class with the input values
        Calculator calc = new Calculator(a, b); // calc is not an object. It's reference variable

        // Performing operations
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());

        // Closing the scanner
        scanner.close();
    }
}
