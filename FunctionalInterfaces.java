
/*
 * Functional Interface (Single Abstract Method interface): only one abstract method
 * 
 * Lambda expressions: we can use lambda expressions only with single abstract methods
 * 
 */

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    int add(int i, int j);
}

class FunctionalInterfaces {
    public static void main(String args[]) {
        A a = new A() {
            public void show() {
                System.out.println("in A show: a");
            }
        };

        A b = () -> System.out.println("in A show: b");

        a.show();
        b.show();

        // B

        B c = new B() {
            public int add(int i, int j) {
                return i + j;
            }
        };

        // B d = (int i, int j) -> return i + j; // this will give error: return keyword
        // is not allowed in lambda expressions

        B d = (int i, int j) -> i + j;

        B e = (i, j) -> i + j;

        int c1 = c.add(16,10);
        int d1 = d.add(16, 10);
        int e1 = e.add(16, 10);

        System.out.println("c1: " + c1);
        System.out.println("d1: " + d1);
        System.out.println("e1: " + e1);
    }
}
