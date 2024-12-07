import java.util.Scanner;

class MyCalculator {
    // Method to calculate the power of n raised to p
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("java.lang.Exception: n and p should be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("java.lang.Exception: n or p should not be zero.");
        }
        return (long) Math.pow(n, p);  // Calculate n raised to power p
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            try {
                // Try to calculate power
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                // If exception occurs, print the exception message
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
