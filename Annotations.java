/*
 * @override : point out the mistakes in naming overriding methods
 * 
 * 
 * 
 * 
 */

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}

class B extends A {
    @Override // this will help in case there is any mistake in naming the method below
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}

class Annotations {
    public static void main(String args[]) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
