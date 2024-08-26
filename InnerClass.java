/*
 * 
 * Only inner classes can be static.
 * Outer classes cannot be static. (only public, abstract & final)
 * Anonymous inner class
 */


class IC1{
    public void show(){
        System.out.println("in show");
    }

    class IC2{
        public void show1(){
            System.out.println("in show1....");
        }
    }

    static class IC3{
        public void show2(){
            System.out.println("in show2....");
        }
    }
}

class InnerClass {
    public static void main(String args[]){
        IC1 obj = new IC1();
        obj.show();

        IC1.IC2 obj1 = obj.new IC2(); // we can access inner class only through the object of outer class, if it is not static
        obj1.show1();

        IC1.IC3 obj2 = new IC1.IC3(); // static inner class can be accessed directly using class name
        obj2.show2();

        IC1 obj3 = new IC1(){
            public void show(){
                System.out.println("in anaonymous inner class' show");
            }
        };

        obj3.show();
    }
}
