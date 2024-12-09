// Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

import java.io.*;
import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.next();
        // int age = scanner.nextInt();
        String name = "vivek";
        int age = 18;
        Person person = new Person(name, age);

        System.out.println(person.name);
        System.out.println(person.age);
        
    }
}