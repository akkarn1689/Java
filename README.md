## This repository is for my Java learninf journey.

```markdown
# Java Basics Documentation

## Table of Contents

1. [Hello World](#hello-world)
2. [Data Types](#data-types)
3. [Operators](#operators)
4. [Object-Oriented Programming](#object-oriented-programming)
    - [Classes and Objects](#classes-and-objects)
    - [Inheritance](#inheritance)
    - [Polymorphism](#polymorphism)
    - [Encapsulation](#encapsulation)
    - [Abstraction](#abstraction)
5. [Arrays](#arrays)
6. [Strings](#strings)

## Hello World

### Code Example

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Explanation

- **`public class HelloWorld`**: Defines a class named `HelloWorld`.
- **`public static void main(String[] args)`**: The entry point of any Java program.
- **`System.out.println("Hello, World!");`**: Prints "Hello, World!" to the console.

### Common Errors

- **`Error: Main method not found in class HelloWorld, please define the main method as: public static void main(String[] args)`**: This error occurs when the main method is missing or incorrectly defined.

---

## Data Types

### Code Example

```java
public class DataTypesExample {
    public static void main(String[] args) {
        int integerNum = 10;
        double doubleNum = 5.99;
        char letter = 'A';
        boolean bool = true;
    }
}
```

### Explanation

- **Primitive Data Types**:
  - **`int`**: Integer data type (e.g., `10`).
  - **`double`**: Floating-point data type (e.g., `5.99`).
  - **`char`**: Character data type (e.g., `'A'`).
  - **`boolean`**: Boolean data type (e.g., `true` or `false`).

### Common Errors

- **`Error: Incompatible types: possible lossy conversion from double to int`**: This occurs when you try to assign a `double` value to an `int` variable without explicit casting.

---

## Operators

### Code Example

```java
public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        boolean isEqual = (a == b);
    }
}
```

### Explanation

- **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
- **Relational Operators**: `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators**: `&&`, `||`, `!`

### Common Errors

- **`Error: Bad operand types for binary operator '+'`**: This occurs when trying to add incompatible data types (e.g., `int` + `String` without concatenation).

---

## Object-Oriented Programming

### Classes and Objects

#### Code Example

```java
class Animal {
    String name;

    void speak() {
        System.out.println(name + " makes a sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Cat";
        cat.speak();
    }
}
```

#### Explanation

- **Class**: A blueprint for objects (e.g., `Animal`).
- **Object**: An instance of a class (e.g., `cat`).

### Inheritance

#### Code Example

```java
class Dog extends Animal {
    void bark() {
        System.out.println(name + " barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Dog";
        dog.bark();
    }
}
```

#### Explanation

- **Inheritance**: Allows one class to inherit fields and methods from another class.

### Polymorphism

#### Code Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
```

#### Explanation

- **Polymorphism**: The ability of an object to take on many forms (e.g., a `Dog` is an `Animal`).

### Encapsulation

#### Code Example

```java
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        System.out.println(person.getName());
    }
}
```

#### Explanation

- **Encapsulation**: Restricting access to certain details of an object and only exposing certain parts.

### Abstraction

#### Code Example

```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
```

#### Explanation

- **Abstraction**: Hiding implementation details and showing only the necessary features.

---

## Arrays

### Code Example

```java
public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```

### Explanation

- **Array**: A collection of elements of the same type stored in a contiguous memory location.

### Common Errors

- **`Error: ArrayIndexOutOfBoundsException`**: This occurs when accessing an index outside the range of the array.

---

## Strings

### Code Example

```java
public class StringsExample {
    public static void main(String[] args) {
        String greeting = "Hello";
        String name = "World";
        String message = greeting + ", " + name + "!";
        System.out.println(message);
    }
}
```

### Explanation

- **String**: A sequence of characters, treated as an object in Java.

### Common Errors

- **`Error: Unclosed string literal`**: This occurs when a string is not properly closed with a double quote.

---

## Conclusion

This documentation covers the essential concepts of Java, including object-oriented programming, data types, arrays, strings, and more. Understanding these basics is crucial for further exploration and mastery of the Java programming language.
```
