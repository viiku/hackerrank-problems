### Constructors in Java
Constructors in Java are special methods used to initialize objects when they are created. Constructors have the same name as the class and do not have a return type, not even void. They are called automatically when you create an instance (object) of a class using the new keyword. Here are some key points about constructors in Java:

#### Default Constructor: 
If a class does not explicitly define any constructors, Java provides a default constructor with no arguments.

#### Parameterized Constructors: 
You can define one or more constructors with parameters to initialize an object with specific values.

#### Copy Constructors:
A copy constructor is a special constructor that is used to create a new object as a copy of an existing object of the same class. It's like making a copy of something you already have.

```
class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor (constructor that takes an object of the same class)
    public Person(Person c) {
        this.name = c.name;
        this.age = c.age;
    }
}

class Codechef {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 62); // Parameterized constructor called here
        System.out.println(person.name);

        Person copiedName = new Person(person); // Copy constructor called here
        System.out.println(copiedName.name);
    }
}

```