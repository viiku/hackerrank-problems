import java.io.*;
import java.util.*;

public class Solution {

    public class Animal {
        void walk() {
            System.out.println("I am walking");
        }    
    }

    public class Bird extends Animal{
        void fly() {
        System.out.println("I am flying");
        }
        
        void sing() {
            System.out.print("I am singing");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Solution solution = new Solution();
        Bird bird = solution.new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        
    }
}