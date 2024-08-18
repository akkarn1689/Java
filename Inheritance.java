import java.util.Scanner;

/*
 * parent - child
 * super - sub
 * base - derived
 */

/*
 * Single-level inheritance
 * multi-level inheritance
 * multiple inheritance is not supported in Java
 */

/*
 * derived class' methods override base class methods
 */

/*
 * Access Modifiers:
 * default: same class, same package subclass, same package non-subclass, 
 * public: can be used anywhere (same class, same package subclass, same package non-subclass, different package subclass, different package non-subclass),
 * private: can be used only in the same class, 
 * protected: can be used anywhere except in different package non-subclass
 */

/*
 * General Practices:
 * try to make classes public
 * try to make variables private
 * try to make methods public (most of the time); use protected if you want it to be used in subclasses only
 * avoid default
 */

class AdvanceCalculator extends Calculator {

    public AdvanceCalculator(int a, int b) {
        super(a, b);
    }

    public int remainder() {
        return a % b;
    }

    public int power() {
        return (int) Math.pow(a, b);
    }
}

class Inheritance {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for a and b
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        // Creating an object of the Calculator class with the input values
        AdvanceCalculator obj = new AdvanceCalculator(a, b);

        // Performing operations
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.subtract());
        System.out.println("Multiplication: " + obj.multiply());
        System.out.println("Division: " + obj.divide());
        System.out.println("Remainder: " + obj.remainder());
        System.out.println("Power: " + obj.power());

        // Closing the scanner
        scanner.close();
    }
}
