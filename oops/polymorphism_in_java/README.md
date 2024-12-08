### Polymorphism in Java
Polymorphism allows objects of different classes to be treated as objects of a common superclass. It provides a way to create more flexible and reusable code by allowing you to write code that can work with objects of multiple types.

#### There are two main types of polymorphism in Java: 
1. Compile-time polymorphism (also known as method overloading) 
2. Runtime polymorphism (also known as method overriding).

1. Compile-Time Polymorphism (Method Overloading):

This occurs when you have multiple methods in the same class with the same name but different parameter lists (number or type of parameters).
The compiler determines which method to call based on the number and types of arguments passed at compile time.

Function overloading, also known as method overloading, is a feature in Java that allows you to define multiple methods in the same class with the same name but different parameter lists. 

```
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```
**Overloading a method in Java is based on changing the number, order, or data types of parameters, but it does not consider the return type.**

#### Can constructors in Java be overloaded like regular methods?
constructors in Java can be overloaded, just like regular methods. Constructor overloading allows you to define multiple constructors with the same name (the class name), but with different parameter lists. This enables you to create objects in various ways depending on the arguments passed during object creation.

```
class Car {
    String model;
    int year;

    // Constructor with no arguments
    public Car() {
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with one argument
    public Car(String model) {
        this.model = model;
        this.year = 0;
    }

    // Constructor with two arguments
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Tesla");
        Car car3 = new Car("BMW", 2022);

        car1.display();
        car2.display();
        car3.display();
    }
}
```

2. Runtime Polymorphism (Method Overriding):

This occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
It allows you to invoke methods on objects of the subclass using the same method signature as in the superclass.

