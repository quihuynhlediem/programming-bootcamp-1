package ExtraDay8.Lab5;

import java.util.Scanner;

public class LabProgram {
    public static int rollingForPair(GVDie d1, GVDie d2, int val){
        int rollsCount = 0;
        /* Type your code here. */
        while (!(d1.compareTo(d2) == 0 && d1.getValue() == val)){
            ++rollsCount;
            d1.roll();
            d2.roll();
        }
        return rollsCount;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        GVDie d1 = new GVDie(); // Create a GVDie object
        GVDie d2 = new GVDie(); // Create a GVDie object
        d1.setSeed(15);   // Set the GVDie object with seed value 15
        d2.setSeed(15);   // Set the GVDie object with seed value 15
        int rolls;
        int val;

        val = scnr.nextInt();
        rolls = rollingForPair(d1, d2, val);
        System.out.println("It took " + rolls + " rolls to get a pair of " + val + "'s.");
    }
}

