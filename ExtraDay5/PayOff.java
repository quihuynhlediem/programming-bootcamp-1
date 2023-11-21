package ExtraDay5;

import java.util.Scanner;

public class PayOff {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double loan = scnr.nextDouble();
        double payment = scnr.nextDouble();
        double interestRate = scnr.nextDouble();

        loan *= (1 + interestRate);
        int paymentNum = 1;
        while (loan - payment > 0){
            loan -= payment;
            loan *= (1 + interestRate);
            ++paymentNum;
        }
        if (paymentNum > 1) {
            System.out.println(paymentNum + " payments");
        }
        else {
            System.out.println(paymentNum + " payment");
        }
    }
}
