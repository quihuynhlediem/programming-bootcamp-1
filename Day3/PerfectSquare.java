package Day3;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double value1, value2, value3;
        boolean squarePerfect1, squarePerfect2, squarePerfect3;
        int intSqrtVal1, intSqrtVal2, intSqrtVal3;

        System.out.println("Please input your first decimal value:");
        value1 = scnr.nextDouble();
        System.out.println("Please input your second decimal value:");
        value2 = scnr.nextDouble();
        System.out.println("Please input your third decimal value:");
        value3 = scnr.nextDouble();
        System.out.println();

        intSqrtVal1 = (int) Math.sqrt(value1);
        squarePerfect1 = (Math.sqrt(value1) == intSqrtVal1);
        intSqrtVal2 = (int) Math.sqrt(value2);
        squarePerfect2 = (Math.sqrt(value2) == intSqrtVal2);
        intSqrtVal3 = (int) Math.sqrt(value3);
        squarePerfect3 = (Math.sqrt(value3) == intSqrtVal3);

        System.out.println("Input     " + "Square Root as Integer        " + "Perfect Square      ");
        System.out.printf("%-10.2f%-30d", value1, intSqrtVal1);
        if (squarePerfect1){
            System.out.println(squarePerfect1 + "                ");
        } else {
            System.out.println(squarePerfect1 + "               ");
        }
        System.out.printf("%-10.2f%-30d", value2, intSqrtVal2);
        if (squarePerfect2){
            System.out.println(squarePerfect2 + "                ");
        } else {
            System.out.println(squarePerfect2 + "               ");
        }
        System.out.printf("%-10.2f%-30d", value3, intSqrtVal3);
        if (squarePerfect3){
            System.out.println(squarePerfect3 + "                ");
        } else {
            System.out.println(squarePerfect3 + "               ");
        }

    }
}
