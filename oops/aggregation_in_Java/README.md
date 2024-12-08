### Aggregation In Java
Aggregation is a form of object composition in which one class contains or is composed of one or more objects of another class. Aggregation represents a "has-a" relationship between classes. It implies that one class (the whole or container) has objects of another class (the part or component).

```
class Address {
    String street;
    String city;
    String postalCode;

    Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    void displayAddress() {
        System.out.println("Street: " + street + ", City: " + city + ", Postal Code: " + postalCode);
    }
}

class Person {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.print("Address: ");
        address.displayAddress();
    }
}

class Codechef {
    public static void main(String[] args) {
        Address personAddress = new Address("123 Main St", "Cityville", "12345");
        Person person = new Person("John Doe", 30, personAddress);

        person.displayInfo();
    }
}
```

Note- Constructor of Person Class initializes a Person object by setting its name, age, and address member variables using the values provided as arguments to the constructor. The address_ member variable is initialized to reference the same Address object that was passed in, forming an aggregation relationship between Person and Address.

This example demonstrates a "has-a" relationship, where a Person "has" an Address, and it illustrates aggregation in Java where one class is composed of another as a part of its structure.

### Object as Parameter
you can pass objects as parameters to methods just like you pass other data types such as integers or strings. When you pass an object as a parameter, you are essentially passing a reference to the object, allowing the method to access and manipulate the object's properties and behavior.

When you pass an object as a parameter, you're passing a reference to the object, so any changes made to the object's properties within the method will affect the original object outside the method as well. This is because the reference points to the same memory location where the object's data is stored.
```
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Codechef {
    // Method that takes a Person object as a parameter
    public static void printPersonInfo(Person p) {
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
    
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Call a method and pass the object as a parameter
        printPersonInfo(person);
    }
}
```

