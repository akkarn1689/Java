
/*
 * LVTI - Local Variable Type Inference (ex: lambda expression)
 * var keyword can be used only inside a function for local variables
 */

// class var{

// } // cannot use var here

class Person {
    String name;
}

class LVTI {
    // var num = 10; // error
    public static void main(String[] args) {
        int a = 9;
        var b = 10;

        String var = "Ashish";

        int c;
        // var d; //error:
        // a variable created using var keyword must be assigned valut at the time of
        // declaration
        var d = 11;

        var obj = new Person();
    }
}
