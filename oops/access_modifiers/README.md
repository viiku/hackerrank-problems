###  Access Modifiers
Access Modifiers in Java
In Java, access modifiers are keywords used to control the visibility and accessibility of classes, methods, fields, and other members within a class. There are four main access modifiers in Java:

public: Accessible from anywhere.
private: Accessible only within the same class.
protected: Accessible within the same class, subclasses(not necessarily in the same package), and other classes in the same package.
Default (package-private): Accessible within the same package.


```
class Student {
    private int age;
}

class Codechef {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 10;
    }
}

// This example will give compilation error, since age field in Student class is decalred private, it can't  be access directly. This means that it can only be accessed within the Student class itself and is not accessible from outside the class, including from the Codechef class.
```

### How to deal with Private Data Member
In Java, getter and setter methods are used to access and modify private data members (fields) of a class. Here's how you can create getter and setter methods for private data members:

Getter Method: A getter method allows you to retrieve the value of a private field.

Setter Method: A setter method allows you to modify the value of a private field.

Using Getter and Setter: You can use the getter and setter methods to access and modify the private field.

In this example, the setMyField method sets the value of myField, and the getMyField method retrieves the value. Getter and setter methods provide controlled access to private fields.

### Access Modifiers
```
public class Main
```
The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality

#### For classes 
`public`	The class is accessible by any other class	
`default`	The class is only accessible by classes in the same package. This is used when you don't specify a modifier. 

#### For attributes, methods and constructors
`public`	The code is accessible for all classes	
`private`	The code is only accessible within the declared class	
`default`	The code is only accessible in the same package. This is used when you don't specify a modifier. 
`protected`	The code is accessible in the same package and subclasses


### Instance Variable
What is an instance variable in Java?
A variable declared within a class but outside any method; it belongs to an instance of the class.
Explanation:
Instance variables, also known as member variables or fields, are declared within a class but outside any method. They belong to instances (objects) of the class and can have different values for each instance.
