import java.io.*;
import java.util.*;

class MotorCycle {
    void getName() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
    }
}

class Cycle extends MotorCycle {
    @Override
    void getName() {
        super.getName();
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

class 
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Cycle cycle = new Cycle();
        cycle.super.getName();
        cycle.getName();
    }
}