
/*
 * Type casting: 
 * 
 * Upcasting: Upcasting is the process of assigning a child class object to a parent class reference. It's implicit (does not require cast operator) and safe. Typecasting of child to parent.
 * 
 * Downcasting: 
 */


 class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class TypeUpDownCasting {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a1 = d1; // Upcasting
        a1.eat(); // Accessible


        Animal a2 = new Dog();
        Dog d2 = (Dog) a2; // Downcasting
        d2.bark(); // Accessible
    }
}
