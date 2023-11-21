package ExtraDay3;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double val1 = scnr.nextDouble();
        double val2 = scnr.nextDouble();
        double val3 = scnr.nextDouble();

        double output1 = Math.pow(val1, val3);
        double output2 = Math.pow(val1, Math.pow(val2, val3));
        double output3 = Math.abs(val2);
        double output4 = Math.sqrt(Math.pow(val1 * val2, val3));

        System.out.println(output1 + " " + output2 + " " + output3 + " " + output4);
    }
}
