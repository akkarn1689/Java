
/*
 * Polymorphism: Many behaviour
 * 
 * Types:
 * 1. Compile time polymorphism: Early binding
 * 2. Runtime polymorphism: late binding (decided at runtime)
 */

/*
 * 
 * Dynamic Method Dispatch
 */

// Runtime polymorphism
class P1 {
    public void show() {
        System.out.println("in P1");
    }
}

class P2 extends P1 {
    public void show() {
        System.out.println("in P2");
    }
}

class P3 extends P1 {
    public void show() {
        System.out.println("in P3");
    }
}

class Polymorphism {
    public static void main(String args[]) {
        P1 obj = new P1();
        obj.show();

        obj = new P2();
        obj.show();

        obj = new P3();
        obj.show();

        // obj is of type P1, but has been assigned reference of object of type P2 & P3
        // also this is possible only if there is inheritance
        //

    }
}
