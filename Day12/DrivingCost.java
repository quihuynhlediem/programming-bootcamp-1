package Day12;

import java.util.Scanner;

public class DrivingCost {

    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
        return milesDriven / milesPerGallon * dollarsPerGallon;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double milesPerGallon = scnr.nextDouble();
        double dollarsPerGallon = scnr.nextDouble();
        double yourValue = 0.0;

        yourValue = drivingCost(milesPerGallon, dollarsPerGallon, 10);
        System.out.printf("%.2f ", yourValue);

        yourValue = drivingCost(milesPerGallon, dollarsPerGallon, 50);
        System.out.printf("%.2f ", yourValue);

        yourValue = drivingCost(milesPerGallon, dollarsPerGallon, 400);
        System.out.printf("%.2f ", yourValue);
    }
}
