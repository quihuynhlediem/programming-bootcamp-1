package Day2;

import java.util.Scanner;

public class RecipeConversion {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input the name of your ingredient:");
        String ingredient = scnr.nextLine();
        System.out.println("Please input the measurement in grams:");
        double measurement = scnr.nextDouble();
        System.out.println("Please input the scale factor:");
        double scaleFactor = scnr.nextDouble();
        System.out.println();

        //Step 1
        final int GRAMS_PER_CUP = 250;
        double cupsNum = measurement / GRAMS_PER_CUP * scaleFactor;

        System.out.println("Ingredient     " + "Grams          " + "Scale Factor   " + "Cups");
        System.out.printf("%-15s%-15.0f%-15.1f%.2f", ingredient, measurement, scaleFactor, cupsNum);
        System.out.println();
        System.out.println();

        //Step 2
        final double PRICE_PER_CUP = 2.64;
        double totalCost = cupsNum * PRICE_PER_CUP;
        System.out.printf("The cost of %.0f cups at $2.64 per cup is $%,.0f", cupsNum, totalCost);
    }
}
