
/*
 * Wrapper Classes in Java
 * A wrapper class in Java is a class that encapsulates a primitive data type. It provides a way to use primitive data types as objects.
 * 
 * Why Wrapper Classes?
 * To use primitive data types in collections: Collections in Java only work with objects, not primitive data types.
 * To provide methods for primitive data types: Wrapper classes offer additional methods for parsing, conversion, and other operations.
 * Autoboxing and unboxing: Java automatically converts between primitive types and their corresponding wrapper objects.
 * Wrapper Classes and Their Corresponding Primitive Types
 * 
 * 
 * Primitive Type - Wrapper Class
 * byte - Byte
 * short - Short
 * int - Integer
 * long - Long
 * float - Float
 * double - Double
 * char - Character
 * boolean - Boolean
 */

class WrapperClass {
    public static void main(String args[]) {
        int num = 10; // Primitive data type
        Integer integerObj = Integer.valueOf(num); // Autoboxing
        int num2 = integerObj; // Auto-unboxing
        System.out.println(integerObj); //
        System.out.println(num2); //
    }
}
