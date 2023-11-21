package ExtraDay3;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int decimalVal = scnr.nextInt();
        int binaryVal = 0;
        int digitCount = 0;

        while (decimalVal > 0){
            binaryVal = binaryVal + ((decimalVal % 2) * (int) Math.pow(10.0, digitCount * 1.0));
            ++digitCount;
            decimalVal /= 2;
        }

        System.out.println(binaryVal);
    }
}
