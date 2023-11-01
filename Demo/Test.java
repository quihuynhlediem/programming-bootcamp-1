package Demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Constants
        final double CONVERSION_RATE = 250.0;  // 1 Australian cup = 250 grams
        final double PRICE_PER_CUP = 2.64;     // Cost per cup

        // Step 1
        System.out.println("Please input the name of your ingredient:");
        String ingredientName = scnr.nextLine();

        System.out.println("Please input the measurement in grams:");
        double measurementGrams = Double.parseDouble(scnr.nextLine());

        System.out.println("Please input the scale factor:");
        double scaleFactor = Double.parseDouble(scnr.nextLine());

        // Convert grams to cups and scale it
        double measurementCups = (measurementGrams / CONVERSION_RATE) * scaleFactor;

        System.out.println(); // Added explicit newline for separation
        System.out.printf("%-15s%-15s%-15s%s%n", "Ingredient", "Grams", "Scale Factor", "Cups");
        System.out.printf("%-15s%-15.0f%-15.1f%.2f%n", ingredientName, measurementGrams, scaleFactor, measurementCups);

        // Step 2
        double totalCost = measurementCups * PRICE_PER_CUP;

        // Rounding up
        totalCost = Math.ceil(totalCost);

        // Displaying the cost directly without if-else check
        System.out.printf("\nThe cost of %.0f cups at $%.2f per cup is $%,.0f", measurementCups, PRICE_PER_CUP, totalCost);
    }
}