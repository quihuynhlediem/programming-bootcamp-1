package ExtraDay7;

import java.util.Scanner;

public class IncomeTax {

    // Calculate AGI and repair any negative values
    public static int calcAGI(int wages, int interest, int unemployment) {
        /* Complete the method and update the return statement */
        if (wages < 0){
            wages = -wages;
        }
        if (interest < 0){
            interest = -interest;
        }
        if (unemployment < 0){
            unemployment = -unemployment;
        }
        return wages + interest + unemployment;
    }

    // Calculate deduction depending on single, dependent or married
    public static int getDeduction(int status) {
        /* Complete the method and update the return statement */
        switch (status){
            case 0:
                return 6000;
            case 1:
                return 12000;
            case 2:
                return 24000;
            default:
                return -1;
        }
    }

    // Calculate taxable but not allow negative results
    public static int calcTaxable(int agi, int deduction) {
        /* Complete the method and update the return statement */
        if (agi - deduction < 0){
            return 0;
        } else {
            return (agi - deduction);
        }
    }

    // Calculate tax for single or dependent
    public static int calcTax(int status, int taxable) {
        /* Complete the method and update the return statement */
        double taxRate;
        double tax = 0;
        int taxBase;
        if (status == 0 || status == 1) {
            if ((taxable > 0) && (taxable <= 10000)) {
                taxRate = 0.1;
                taxBase = 0;
            } else if (taxable <= 40000) {
                taxRate = 0.12;
                tax = 1000;
                taxBase = 10000;
            } else if (taxable <= 85000) {
                taxRate = 0.22;
                tax = 4600;
                taxBase = 40000;
            } else {
                taxRate = 0.24;
                tax = 14500;
                taxBase = 85000;
            }
        }
        else {
            if ((taxable > 0) && (taxable <= 20000)) {
                taxRate = 0.1;
                taxBase = 0;
            } else if (taxable <= 80000) {
                taxRate = 0.12;
                tax = 2000;
                taxBase = 20000;
            } else {
                taxRate = 0.22;
                tax = 9200;
                taxBase = 80000;
            }
        }
        double federalTax = (taxable - taxBase) * taxRate + tax;
        return (int) federalTax;
    }

    // Calculate tax due and check for negative withheld
    public static int calcTaxDue(int tax, int withheld) {
        /* Complete the method and update the return statement */
        return tax - withheld;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wages = 0;
        int interest = 0;
        int unemployment = 0;
        int status = -1; // 0=dependent, 1=single, and 2=married
        int withheld = 0;
        int agi;

        // Step #1: Input information
        wages = scan.nextInt();
        interest = scan.nextInt();
        unemployment = scan.nextInt();
        status = scan.nextInt();
        withheld = scan.nextInt();

        // Step #2: Calculate AGI
        agi = calcAGI(wages, interest, unemployment);
        System.out.printf("AGI: $%,d\n", agi);

        //Step #3:
        int deduction = getDeduction(status);
        System.out.printf("Deduction: $%,d\n", deduction);

        //Step #4:
        int taxable = calcTaxable(agi, deduction);
        System.out.printf("Taxable income: $%,d\n", taxable);

        //Step #5:
        int federalTax = calcTax(status, taxable);
        System.out.printf("Federal tax: $%,d\n", federalTax);

        //Step #6:
        int taxDue = calcTaxDue(federalTax, withheld);
        System.out.printf("Tax due: $%,d\n", taxDue);
    }
}