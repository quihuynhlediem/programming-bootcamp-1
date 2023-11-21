package ExtraDay4;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int wage = scnr.nextInt();
        int taxable = scnr.nextInt();
        int unemployedCompensation = scnr.nextInt();
        int marriedStatus = scnr.nextInt();
        int taxWithheld = scnr.nextInt();

        // Step 1:
        int AGI = wage + taxable + unemployedCompensation;
        System.out.printf("AGI: $%,d\n", wage + taxable + unemployedCompensation);

        if (AGI <= 120000) {
            //Step 2:
            int deduction;
            if (marriedStatus == 2) {
                deduction = 24000;
            } else {
                deduction = 12000;
            }
            System.out.printf("Deduction: $%,d\n", deduction);
            if (AGI - deduction < 0){
                System.out.println("Taxable income: $0");
            }
            else {
                System.out.printf("Taxable income: $%,d\n", AGI - deduction);
            }

            //Step 3:
            double taxRate;
            int tax = 0;
            int taxBase = 0;
            if (marriedStatus == 1) {
                if ((AGI - deduction >= 0) && (AGI - deduction <= 10000)) {
                    taxRate = 0.1;
                } else if (AGI - deduction <= 40000) {
                    taxRate = 0.12;
                    tax = 1000;
                    taxBase = 10000;
                } else if (AGI - deduction <= 85000) {
                    taxRate = 0.22;
                    tax = 4600;
                    taxBase = 40000;
                } else {
                    taxRate = 0.24;
                    tax = 14500;
                    taxBase = 85000;
                }
            } else {
                if ((AGI - deduction >= 0) && (AGI - deduction <= 20000)) {
                    taxRate = 0.1;
                } else if (AGI - deduction <= 80000) {
                    taxRate = 0.12;
                    tax = 2000;
                    taxBase = 20000;
                } else {
                    taxRate = 0.22;
                    tax = 9200;
                    taxBase = 80000;
                }
            }
            int federalTax = (int) Math.round((AGI - deduction - taxBase) * taxRate + tax);
            System.out.printf("Federal tax: $%,d\n", federalTax);

            //Step 4:
            if (taxWithheld - federalTax > 0) {
                System.out.printf("Tax refund: $%,d\n", taxWithheld - federalTax);
            } else if (taxWithheld - federalTax < 0) {
                System.out.printf("Tax due: $%,d\n", federalTax - taxWithheld);
            }
        }
        else {
            System.out.println("Error: Income too high to use this form");
        }
    }
}
