import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] arr = new int[size];
        // boolean isNegative = false;
        // int count =0;
        for(int k=0;k<size;k++) {
            arr[k] = read.nextInt();
        }
        
        read.close();
        int countNegative = 0;
        for(int i= 0; i< size ;i++) {
            if(arr[i] < 0) {
                countNegative ++;
            }
            int subArraySum = arr[i];
            for(int j =i;j<size ;j++) {
                subArraySum += arr[j];
                if(subArraySum < 0 ) {
                    countNegative++;
                }
            }
            subArraySum = 0;
            System.out.println(countNegative);
        }
        // System.out.println(countNegative);
    }
}