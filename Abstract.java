/*
 * Abstract class cannot be instantiated. That is we cannot create object of an abstract class.
 * Abstract method can be defined only in the abstract class
 * It is not compulsory for abstract class to have abstract methods
 * 
 * if a class which extends an abstract class does not implement all the abstract classes of the parent class then it has to be an abstract class
 * 
 * Concrete classes: the class which is not an abstract class. We can create object of a concrete class.
 */

abstract class Car {
    public abstract void drive();

    public void playMysic() {
        System.out.println("play music");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("driving...");
    }
}

class Abstract {
    public static void main(String args[]) {
        // Car obj = new Car();
        Car obj = new WagonR();
        obj.drive();
        obj.playMysic();

        // abstract class with anonymous class
        Car obj1 = new Car(){
            public void drive() {
                System.out.println("driving in an anonymous class of car...");
            }
        };

        obj1.drive();
    }
}
