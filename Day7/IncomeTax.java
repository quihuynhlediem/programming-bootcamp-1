package Day7;

import java.util.Scanner;

public class IncomeTax {
    public static double getCorrespondingTableValue(int search, int [] baseTable, double [] valueTable) {
        int baseTableLength;
        double value;
        int i;
        boolean keepLooking;

        baseTableLength = baseTable.length;
        value = 0.0;
        i = 0;
        keepLooking = true;

        while ((i < baseTableLength) && keepLooking) {
            if (search <= baseTable[i]) {
                value = valueTable[i];
                keepLooking = false;
            }
            else {
                ++i;
            }
        }

        return value;
    }

    public static int getNextInput(Scanner scnr){
        System.out.println("\nEnter annual salary  (0 to exit): ");
        return scnr.nextInt();
    }

    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int annualSalary;
        double taxRate;
        int taxToPay;
        int i;

        int [] salaryBase = { 20000,     50000,     100000,     999999999 };
        double [] taxBase = {   .10,       .20,        .30,           .40 };

        // FIXME: Change the input to come from a method
        System.out.println("\nEnter annual salary (0 to exit): ");
        annualSalary = getNextInput(scnr);

        while (annualSalary > 0) {
            taxRate = getCorrespondingTableValue(annualSalary, salaryBase,  taxBase);

            taxToPay= (int)(annualSalary * taxRate);  // Truncate tax to an integer amount
            System.out.println("Annual salary: " + annualSalary +
                    "\tTax rate: " + taxRate +
                    "\tTax to pay: " + taxToPay);

            // Get the next annual salary
            annualSalary = getNextInput(scnr); // annualSalary = scnr.nextInt();
        }
    }
}

