import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
    public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int total_sum = n;
        for (int i = 1; i<=n/2 ;i ++ ) {
            if (n%i == 0) {
                total_sum += i;
            }
        }
        return total_sum;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        MyCalculator mycalculator = new MyCalculator();
        System.out.print("I implemented: "+mycalculator.getClass().getInterfaces()[0].getSimpleName()+"\n"+mycalculator.divisor_sum(n));
    }
}