A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses.

```
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

Book new_novel=new Book();  // Gives Error
```
You have to create another class that extends the abstract class. Then you can create an instance of the new class.

Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.

**The `abstract` keyword is a `non-access modifier`, used for classes and methods:**

### Abstract class: 
It is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Purpose: To define a common interface and/or shared behavior for a group of related classes.
Key Feature: It may contain both concrete (implemented) methods and abstract (unimplemented) methods.

### Abstract Method
An abstract method is a method declared in an abstract class that has no implementation in that class. Subclasses are required to provide an implementation for this method.

Purpose: To enforce that all subclasses implement specific behavior.
Key Feature: Declared using the @abstractmethod decorator (in Python) or similar mechanisms in other languages.