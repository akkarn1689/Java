/*
 * Static variable or methods are bound to class. These are not
 */
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        // System.out.println(brand + " : " + price + " : " + name); 
        // we cannot directly access non-static variables inside static methods
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

class Statics {
    public static void main(String args[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone"; // bcoz it is bound to class or it is property of class

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;
        Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
