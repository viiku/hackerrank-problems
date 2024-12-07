### Inheritance in Java
Inheritance is a fundamental concept in object-oriented programming (OOP), including Java. It allows you to create a new class (called a subclass or derived class) based on an existing class (called a base class or parent class).

#### Base Class (Parent Class):
The base class is the class from which other classes inherit properties and behaviors.
It serves as the template or blueprint for creating derived classes.

#### Derived Class (Child Class or Subclass):
The derived class is a new class created by inheriting properties and behaviors from a base class.
It can add new attributes and methods in addition to those inherited from the base class.


#### Visibility of Inherited Members
Access Modifier	Class	Package	Subclass	World
public	        Yes	    Yes	    Yes	        Yes
protected	    Yes	    Yes	    Yes     	No
default	        Yes	    Yes	    No	        No
private	        Yes	    No	    No      	No

1. Public: Members with public access can be accessed from anywhere, both within and outside the class, in any package.
2. Protected: Members with protected access can be accessed within the class, by subclasses (including those in other packages), and by classes in the same package.
3. Default (No Modifier): Members with default access can be accessed within the class and by classes in the same package but not by subclasses in other packages.
4. Private: Members with private access can only be accessed within the class itself.

Java supports five types of inheritance:
1. Single inheritance
    single inheritance refers to a class inheriting from only one base class.

```
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // calling the constructor of the base class
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy");

        // Call methods from the base class
        myDog.eat();

        // Call method from the derived class
        myDog.bark();
    }
}
```

2. Hierarchical inheritance
Hierarchical inheritance in Java is a type of inheritance where multiple classes inherit from a single base class. In other words, it represents a tree-like structure of inheritance where a single parent class has multiple child classes. Each child class inherits the properties and behaviors of the parent class and may have its own additional properties and behaviors. Hierarchical inheritance is commonly used to model relationships where different classes share common characteristics but have their own unique features.
```
// Base class
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class 1
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Child class 2
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create instances of child classes
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        // Call methods from the base class and child classes
        myDog.eat();
        myDog.bark();

        myCat.eat();
        myCat.meow();
    }
}

```
3. Multilevel inheritance
Multilevel inheritance involves a chain of inheritance, where a derived class inherits from a base class, and then another class inherits from that derived class.
```
class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    protected int numLegs;

    Mammal(String name, int numLegs) {
        super(name); // calling constructor of parent class
        this.numLegs = numLegs;
    }

    void walk() {
        System.out.println(name + " is walking on " + numLegs + " legs.");
    }
}

class Dog extends Mammal {
    Dog(String name, int numLegs) {
        super(name, numLegs);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 4);

        // Access and modify protected members
        myDog.eat();
        myDog.walk();
        myDog.bark();
    }
}
```
4. Multiple inheritance (using Interfaces)
5. Hybrid inheritance (using Interfaces)


### Overriding in single inheritance
Method overriding in Java is a mechanism that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. The overriding method in the subclass should have the same name, return type, and parameters (if overridden), but it may provide a different implementation. Method overriding is a key concept in achieving runtime polymorphism in object-oriented programming.

```
// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Codechef {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Calls Dog's makeSound method
        animal2.makeSound(); // Calls Cat's makeSound method
    }
}
```

1. The Animal class defines a method called makeSound.
2. The Dog and Cat classes are subclasses of Animal. They override the makeSound method with their own implementations.
3. In the main method, we create instances of both Dog and Cat but store them in variables of type Animal. This is an example of polymorphism, where objects of different classes are treated as objects of a common superclass.
4. When we call the makeSound method on animal1 and animal2, Java determines which version of the method to call based on the actual runtime type of the objects. As a result, the overridden makeSound method in the respective subclass is executed, demonstrating method overriding.


#### Multilevel inheritance
```
// Base class
class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void displayDetails() {
        System.out.println(studentName);
    }
}

// Graduate class (inherits from Student)
class Graduate extends Student {
    private int graduationYear;

    public Graduate(String studentName, int graduationYear) {
        super(studentName);
        this.graduationYear = graduationYear;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(graduationYear);
    }
}

// Postgraduate class (inherits from Graduate)
class Postgraduate extends Graduate {
    private String thesisTopic;

    public Postgraduate(String studentName, int graduationYear, String thesisTopic) {
        super(studentName, graduationYear);
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(thesisTopic);
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create instances of Student and Postgraduate
        Student student = new Student("Alice");
        Postgraduate postgraduate = new Postgraduate("Carol", 2025, "Quantum Mechanics");

        // Display details of each student type
        student.displayDetails();
        System.out.println();
        postgraduate.displayDetails();
    }
}
```