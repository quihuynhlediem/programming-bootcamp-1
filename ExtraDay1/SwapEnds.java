package ExtraDay1;

import java.util.Scanner;

public class SwapEnds {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int []arrInput = new int[arrSize];
        for (int i = 0; i < arrSize; ++i){
            arrInput[i] = scnr.nextInt();
        }

        int temp = arrInput[0];
        arrInput[0] = arrInput[arrSize - 1];
        arrInput[arrSize - 1] = temp;

        for (int i = 0; i < arrSize; ++i){
            System.out.print(arrInput[i] + " ");
        }
        System.out.println();
    }
}
