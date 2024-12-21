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
        Integer []array = {1,2,3};
        String []strArray = {"Hello", "World"};
        printArray(array);
        printArray(strArray);
    }
}
