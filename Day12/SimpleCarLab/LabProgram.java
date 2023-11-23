package Day12.SimpleCarLab;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        int milesForward = scnr.nextInt();
        int milesReverse = scnr.nextInt();
        SimpleCar myCar = new SimpleCar();
        myCar.drive(milesForward);
        myCar.reverse(milesReverse);

        myCar.honkHorn();
        myCar.report();
    }
}

