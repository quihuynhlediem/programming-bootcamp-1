package ExtraDay6;

import java.util.Scanner;

public class ShiftRight {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int lastValue = 0;
        int []arrInput = new int[arrSize];
        for (int i = 0; i < arrSize; ++i){
            arrInput[i] = scnr.nextInt();
        }

        for (int i = arrSize - 1; i >= 0; --i){
            if (i == arrSize - 1){
                lastValue = arrInput[i];
            }
            if (i != 0){
                arrInput[i] = arrInput[i - 1];
            }
            else {
                arrInput[0] = lastValue;
            }
        }

        for (int i = 0; i < arrSize; ++i){
            System.out.print(arrInput[i] + " ");
        }
        System.out.println();
    }
}
