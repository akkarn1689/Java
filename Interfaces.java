/*
 * Interfaces
 * Interface is not a class
 * By default every method in an interface is public abstract
 * We cannot instantiate an interface
 * We can create references of an interface
 * A variable declared in an interface is by default final and static
 * A class which implements an interface must implement all the methods in the interface. If not the class is by default abstract class.
 * 
 * 
 */

/*
 * Types of interfaces:
 * 1. Normal interface: has 2 or more methods
 * 2. Functional interface (SAML interface): has single abstract method
 * 3. Marder interface:  an interface that does not contain any methods, fields, or constants. 
 *    It is used to deliver type information at runtime to the JVM so that it can take some action based on the information received. 
 */

/*
 * class - class -> extends
 * class - interface -> implements
 * interface - interface -> extends
 */

// abstract class Computer{
//     public abstract void code();
// }

// class Laptop extends Computer{
//     public void code() {
//         System.out.println("code, compile, run");
//     }
// }

// class Desktop extends Computer{
//     public void code() {
//         System.out.println("code, compile, run: faster");
//     }
// }

// Interface
interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run: faster");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

// Example2
interface X {
    String name = "Ashish";
    int age = 22;

    void show();

    void config();
}

interface Y {
    void run();
}

interface W extends Y {

}

class V implements X, W {
    public void show() {
        System.out.println("show...");
    }

    public void config() {
        System.out.println("config...");
    }

    public void run() {
        System.out.println("run...");
    }
}

class Z implements X, Y {
    public void show() {
        System.out.println("show...");
    }

    public void config() {
        System.out.println("config...");
    }

    public void run() {
        System.out.println("run...");
    }
}

class Interfaces {
    public static void main(String args[]) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer ashish = new Developer();
        ashish.devApp(desk);

        X obj;
        obj = new Z();
        obj.show();
        obj.config();
        // obj.run();
        // this will give error as obj has reference of interface X, which has only
        // show() and config()
    }
}
