# final
The final keyword in Java is used to apply restrictions to variables, methods, and classes. It is a versatile keyword with different meanings depending on where it is used. 

### Final Variables
When a variable is declared as final, it becomes a constant. Once initialized, its value cannot be changed.

Usage
Primitive Types: The value cannot be reassigned.
Reference Types: The reference cannot point to a different object, but the object's internal state can still change

```
final int MAX_VALUE = 100; // Constant variable
MAX_VALUE = 200; // Error: Cannot assign a new value
```

#### Significance
Immutability: Ensures the value remains constant throughout the program.
Thread Safety: Prevents accidental changes in multi-threaded environments.
Good Practice: Often used to declare constants, improving code readability and maintainability.

### Final Methods
A method declared as final cannot be overridden by subclasses.

```
class Parent {
    public final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // public void display() { } // Error: Cannot override final method
}
```

#### Significance
Prevent Overriding: Ensures that the behavior defined in the parent class remains unchanged in subclasses.
Security: Prevents malicious or accidental modification of critical methods.
Performance: Allows the compiler to optimize method calls (e.g., inline expansion).

### Final Classes
A class declared as final cannot be subclassed.

```
final class Utility {
    public void performTask() {
        System.out.println("Performing task...");
    }
}

// class SubUtility extends Utility { } // Error: Cannot subclass final class
```

##### Significance
Prevent Inheritance: Used to create immutable classes (e.g., String class in Java).
Security: Prevents alteration of core logic by disallowing inheritance.
Design Choice: Indicates that the class is complete and should not be extended.

### Final Parameters
When a method parameter is declared as final, it cannot be reassigned within the method.

```
public void display(final int number) {
    // number = 10; // Error: Cannot reassign final parameter
    System.out.println(number);
}
```

#### Significance
Clarity: Makes it clear that the parameter is read-only within the method.
Error Prevention: Avoids accidental reassignment of parameters

### Final and Immutability
Immutable Classes: final is often used in conjunction with other design practices to create immutable classes.
Example: String class in Java is final to ensure immutability and prevent subclassing.

#### When to Use final
For Constants: Use final with static to declare constants.
```
public static final double PI = 3.14159;
```
For Security: Use final to prevent overriding or inheritance of critical methods or classes.

For Immutability: Use final to enforce immutability in variables, parameters, and classes.

For Performance: The compiler can optimize the code when final is used, especially for methods.

#### Key Points
Final Variables: Once assigned, their value cannot be changed.
Final Methods: Cannot be overridden in subclasses.
Final Classes: Cannot be extended by other classes.
Final Parameters: Cannot be reassigned within a method.
