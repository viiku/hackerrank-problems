import java.io.*;
import java.util.*;

class Arithmetic {
    public int add(int integer1, int integer2) {
        return integer1+integer2;
    }
}

class Adder extends Arithmetic {

}
    
public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Solution solution = new Solution();
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getGenericSuperclass().getTypeName());

        System.out.println(adder.add(30,12) + " " + adder.add(10,3) + " " + adder.add(15,5));
    }
}
