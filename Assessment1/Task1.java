package Assessment1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the principle amount:");
        int principle = scnr.nextInt();
        System.out.println("Please enter the interest rate:");
        double interest = scnr.nextDouble();
        System.out.println("Please enter the frequency of interest:");
        int frequency = scnr.nextInt();
        System.out.println("Please enter the time period of the investment:");
        int period = scnr.nextInt();
        System.out.println();

        System.out.printf("You entered a principle amount of $%,.2f.\n", (double) principle);
        System.out.printf("Rate of interest is %.2f percent.\n", interest);
        System.out.printf("Increase occurs %d times per year for a period of %d years.\n", frequency, period);
        // principle*(1+(interest rate / 100)) ^ (frequency * time invested ) – principle
        double compoundInterest = principle * Math.pow(1 + (interest / 100), (frequency * period)) - principle;
        System.out.printf("The total interest payable at the end of %d years is: $%,.2f.\n", period, compoundInterest);
        System.out.printf("The total value of the investment after %d years is: $%,.2f.\n", period, compoundInterest + principle);
    }
}
