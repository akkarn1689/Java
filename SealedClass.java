
/*
 * abstract class: meant to be inherited
 * final class: no class can inherit this class
 * sealed class: restrict the subclasses for a particular class
 * 
 * 
 * the classes which are permitted to be inherit "sealed classes":
 * 1. must extend the sealed classes
 * 2. must be: a sealed class, a non-sealed class, or a final class
 * 
 * the interface which is extending a sealed interface can only be: sealed or non-sealed
 */

sealed class A permits B, C {

}

final class B extends A {

}

final class C extends A {

}

// the class declaration of class D extending A will give error, since it has
// not been permitted to extend A

// class D extends A{

// }

class SealedClass {
    public static void main(String[] args) {

    }
}
