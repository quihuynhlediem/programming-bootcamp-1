package Day12;

import java.util.Scanner;

public class TwoSmallestNumbers {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int []arrInput = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arrInput[i] = scnr.nextInt();
        }

        int minInt = arrInput[0];
        int secondMinInt = arrInput[0];

        for (int i = 1; i < arrSize; i++) {
            if (arrInput[i] < minInt){
                minInt = arrInput[i];
            }
        }

        for (int i = 1; i < arrSize; i++) {
            if (arrInput[i] < secondMinInt && arrInput[i] != minInt){
                secondMinInt = arrInput[i];
            }
        }

        System.out.printf("%d and %d\n", minInt, secondMinInt);
    }
}
