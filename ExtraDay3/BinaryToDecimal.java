package ExtraDay3;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int binaryVal = scnr.nextInt();
        int decimalVal = 0;
        int termCount = 0;

        while (binaryVal > 0){
            decimalVal += (binaryVal % 10) * (int) Math.pow(2.0, termCount);
            ++termCount;
            binaryVal /= 10;
        }

        System.out.println(decimalVal);
    }
}
