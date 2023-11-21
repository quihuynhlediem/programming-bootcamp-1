package ExtraDay2;

import java.util.Scanner;

public class WallPainting {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double wallHeight = scnr.nextDouble();
        double wallWidth = scnr.nextDouble();
        double paintCost = scnr.nextDouble();

        // Step 1:
        double area = wallHeight * wallWidth;
        System.out.printf("Wall area: %.1f sq ft\n", area);

        //Step 2:
        double paintGallons = area / 350.0;
        System.out.printf("Paint needed: %.3f gallons\n", paintGallons);

        //Step 3:
        int cansNum = (int) Math.ceil(paintGallons);
        System.out.println("Cans needed: " + cansNum + " can(s)");

        //Step 4:
        double totalCost = paintCost * cansNum;
        System.out.printf("Paint cost: $%.2f\n", totalCost);
        System.out.printf("Sales tax: $%.2f\n", totalCost * 0.07);
        System.out.printf("Total cost: $%.2f\n", totalCost * 1.07);
    }
}
