package ExtraDay3;

import java.util.Scanner;

public class MusicNoteFrequencies {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double f0 = scnr.nextDouble();

        double r = Math.pow(2.0, 1.0 / 12.0);

        System.out.printf("%.2f Hz\n", f0);
        System.out.printf("%.2f Hz\n", f0 * Math.pow(r, 1.0));
        System.out.printf("%.2f Hz\n", f0 * Math.pow(r, 2.0));
        System.out.printf("%.2f Hz\n", f0 * Math.pow(r, 3.0));
    }
}
