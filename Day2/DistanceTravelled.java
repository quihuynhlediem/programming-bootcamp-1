package Day2;

import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int kilometres;
        int metres;
        int centimetres;
        int millimetres;
        int MILLI_PER_KILO = 1000000;
        int MILLI_PER_METRE = 1000;
        int MILLI_PER_CENTI = 10;

        System.out.println("Please enter kilometres, metres, centimetres, and millimetres on a single line:");

        kilometres = scnr.nextInt();
        metres = scnr.nextInt();
        centimetres = scnr.nextInt();
        millimetres = scnr.nextInt();

        int result = (kilometres * MILLI_PER_KILO) + (metres * MILLI_PER_METRE) + (centimetres * MILLI_PER_CENTI) + millimetres;

        System.out.println("Total millimetres: " + result);
        scnr.close();
    }
}