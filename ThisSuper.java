/*
 * every constructor has a super() method, even if it is not defined explicitly.
 * this is the first statement in the constructor
 * this method calls the default constructor of a super call
 */

/*
 * Every class in Java extends the "Object" class
 */

/*
 * constructor call ( this() or super() ) must be first statement in a constructor
 */
class A {
    public A() {
        super(); // every constructor has this even if we do not mention
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this(); //
        // super(); // this will call the default constructor of super class
        // super(n); // this will call the parameterized constructor of super class
        System.out.println("in B int");
    }
}

class ThisSuper {
    public static void main(String args[]) {
        B obj = new B(5);
    }
}
