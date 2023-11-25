package ExtraDay8.Lab19;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int credits;
        int seed;
        GVDie die1, die2;
        die1 = new GVDie();
        die2 = new GVDie();

        // Read random seed to support testing (do not alter)
        seed = scnr.nextInt();
        die1.setSeed(seed);

        // Read starting credits
        credits = scnr.nextInt();

        /* Insert your code here */
        boolean isPlaying = true;
        int diceTotal;
        int diceGoal;
        int roundCount = 0;
        while (credits > 0 ) {
            //Step 1:
            die1.roll();
            die2.roll();
            diceTotal = die1.getValue() + die2.getValue();
            if (diceTotal == 7 || diceTotal == 11) {
                ++credits;
                System.out.println("Dice total: " + diceTotal);
                System.out.println("Credits: " + credits);
            } else if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12) {
                --credits;
                System.out.println("Dice total: " + diceTotal);
                System.out.println("Credits: " + credits);
            } else {
                System.out.println("Dice total: " + diceTotal);
                // Step 2
                diceGoal = diceTotal;
                while (true) {
                    die1.roll();
                    die2.roll();
                    diceTotal = die1.getValue() + die2.getValue();
                    if (diceTotal == 7) {
                        --credits;
                        System.out.println("Dice total: " + diceTotal);
                        System.out.println("Credits: " + credits);
                        break;
                    } else if (diceTotal == diceGoal) {
                        ++credits;
                        System.out.println("Dice total: " + diceTotal);
                        System.out.println("Credits: " + credits);
                        break;
                    } else {
                        System.out.println("Dice total: " + diceTotal);
                    }
                }
            }
            ++roundCount;
        }
        System.out.println("Rounds: " + roundCount);
    }
}
