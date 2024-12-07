import java.io.*;
import java.util.*;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }

}

class MyBook extends Book {
    // @override abstract class method
    void setTitle(String s) {
        title = s;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        scanner.close();
        MyBook mybook = new MyBook();
        mybook.setTitle(title);
        System.out.print("The title is: "+mybook.getTitle());
    }
}