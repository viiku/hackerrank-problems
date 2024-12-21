### Generic
A generic method allows you to create a method that can handle different types of data (such as Integer[] and String[]) using a single method definition.

```
public class GenericMethodExample {

    // Generic method to print elements of any array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        // Test with String array
        String[] strArray = {"Hello", "World", "Java"};
        System.out.println("\nString Array:");
        printArray(strArray);
    }
}
```

Explanation:
The method printArray is defined with a generic type parameter <T>, where T can be any type (e.g., Integer, String, etc.).
Inside the method, we loop through the array and print each element.
In the main method, we test the printArray method with both Integer[] and String[] arrays.

#### 
In Java, primitive arrays (like int[]) are not compatible with generics because generics work only with reference types.

<!-- COMPILATION ERROR -->
```
import java.io.*;
import java.util.*;

public class Solution {

    // Generic method to print elements of any array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int []array = {1,2,3};                      // NOT A PREMITITVE TYPE
        String []strArray = {"Hello", "World"};     // A PREMITIVE TYPE
        printArray(array);
        printArray(strArray);
    }
}
```