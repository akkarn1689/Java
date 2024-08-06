// Data types:

// Primitive data types
// Integer: byte(1 byte), short(2 bytes), int(4 bytes), long (8 bytes)
// Float: float(4 bytes), double (8 bytes - default value)
// Char: char (2 bytes) - UNICODE character
// Boolean: boolean


// Important concepts:
// type casting or conversion
// type promotion


class DataType {
    public static void main(String arr[]){

        // Primitive data types
        byte a = 127; // -128 to 127
        short b = 10; // 
        int c = 259;
        long d = 2316465165165165l;
        float e = 1.5f;
        double f = 1.5;
        char g = 'k'; // '' for char & "" for string
        boolean h = true; // true or false only (can't use 0, 1)

        // System.out.println(a);
        // System.out.println(b);
        System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(f);
        // System.out.println(g);
        // System.out.println(h);

        // Literals
        int num1 = 0b101;
        int num2 = 0x7E;
        int num3 = 10_00_00_000;

        // System.out.println(num1); // 5
        // System.out.println(num2); // 126
        // System.out.println(num3); // 100000000

        byte i = (byte) c; // c % 256 (integer to byte conversion)
        int j = a*i; // type promotion
        System.out.println(j); //
    }    
}
