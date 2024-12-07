import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.close();

            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            // Handle invalid input
            System.out.println("java.util.InputMismatchException");
        }
    }
}