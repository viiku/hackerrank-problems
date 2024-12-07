### Static in Java
when you declare a member as static, it means that the member belongs to the class itself rather than to any specific instance of the class. 

1. Static Fields (Class Variables):

You can access static fields using the class name or directly from an instance of the class, but it's more common to use the class name. Static fields are initialized only once when the class is loaded.

```
public class MyClass {
    public static int count = 0; // Static field
}
```
2. Static Methods:

You can call static methods using the class name.
Static methods can't access instance-level members directly because they don't have access to an instance of the class.

In Java, a static method is a method that belongs to the class rather than to any specific instance of the class. You can call a static method on the class itself, without creating an instance of the class. Static methods are commonly used for utility functions or operations that do not depend on the state of any particular object.

**Static methods are handy for creating utility classes or for operations that don't require access to instance-specific data. They are also used frequently in Java's standard libraries.**
```
public class MyClass {
    public static void staticMethod() {
        // Static method
    }
}
```
3. Static Blocks:

Static blocks are used to initialize static fields or perform any other static setup when the class is loaded.
They are executed only once when the class is loaded, before any static method or constructor is called.

Static blocks are executed only once when the class is loaded, regardless of how many instances of the class are created.
They are often used for performing tasks such as initializing static variables, setting up static configurations, or loading resources that are shared among all instances of the class.
Static blocks are executed in the order in which they appear in the class.
They are particularly useful when you need to perform complex initialization that cannot be achieved in a single line or expression.
Static blocks are a convenient way to ensure that certain initialization tasks are completed before any other code in the class is executed.
**static block is a block of code enclosed in curly braces {} and with static keyword. This block of code is executed when the class is loaded into memory, before any instances of the class are created or any static members are accessed.**
```
public class MyClass {
    static {
        // Static block
    }
}
```

4. Static Nested Classes:

You can define a static nested class within another class.
Static nested classes are associated with the outer class and do not require an instance of the outer class to be created.
**A static nested class is a class that is defined within another class, and it is marked as static. This means that you can access a static nested class without creating an instance of the outer class.**
```
public class OuterClass {
    static class StaticNestedClass {
        // Static nested class
    }
}
```
```
class OuterClass {
    // Static nested class
    public static class StaticNestedClass {
        
        // Static nested class can have its own fields and methods
        private int nestedField = 20;
        
        // Constructor for the static nested class
        public StaticNestedClass() {
            // Empty constructor
        }
        
        // Method in the static nested class
        public void display() {
            System.out.println("Value of nestedField: " + nestedField);
        }
    }
}


class Codechef {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        
        // Access the nested class's method and field
        nestedObj.display();
    }
}
```

Example:- 
```
import java.util.Scanner;

class BankAccount {
    public static int totalBalance;
    public int balance;

    public BankAccount(int amount) {
        totalBalance += amount;
    }
}


class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        BankAccount account1 = new BankAccount(amount);

        amount = scanner.nextInt();
        BankAccount account2 = new BankAccount(amount);

        System.out.println(account2.totalBalance);

        scanner.close();
    }
}
```