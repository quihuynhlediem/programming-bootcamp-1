package ExtraDay1;

import java.util.Scanner;

public class FindMode {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] arrInput = new int[21];
        int value = scnr.nextInt();
        while (value != -1){
            ++arrInput[value];
            value = scnr.nextInt();
        }

        int max = 0;
        int maxAppearVal = 0;
        for (int i = 1; i <= 20; ++i){
            if (max < arrInput[i]){
                max = arrInput[i];
                maxAppearVal = i;
            }
        }
        System.out.println(maxAppearVal);
    }
}
