package ExtraDay1;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int[] arrInput = new int[arrSize];
        for (int i = 0; i < arrSize; ++i) {
            arrInput[i] = scnr.nextInt();
        }

        //Step 1:
        int min = arrInput[0];
        int max = arrInput[0];
        for (int i = 0; i < arrSize; ++i) {
            if (max < arrInput[i]){
                max = arrInput[i];
            }
            if (min > arrInput[i]){
                min = arrInput[i];
            }
        }
        System.out.printf("Minimum: %d\n", min);
        System.out.printf("Maximum: %d\n", max);

        //Step 2:
        double sum = 0.0;
        for (int i = 0; i < arrSize; ++i) {
            sum += arrInput[i];
        }
        System.out.printf("Mean: %.1f\n", (sum / arrSize));

        //Step 3:
        boolean isPalindrome = true;
        for (int i = 0; i < (arrSize / 2); ++i){
            if (arrInput[i] != arrInput[arrSize - i - 1]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome: " + isPalindrome);

        //Step 4:
        Arrays.sort(arrInput);
        if (arrSize % 2 != 0){
            double median = arrInput[arrSize / 2];
            System.out.println("Median: " + median);
        }
        else {
            double median = (arrInput[(arrSize / 2) - 1] + arrInput[arrSize / 2]) / 2.0;
            System.out.println("Median: " + median);
        }

        //Step 5:
        int newVal = arrInput[0];
        int valCount = 1;
        int maxAppearance = 0;
        int mode = 0;
        int i = 1;
        while (i < arrSize){
            while ((i < arrSize) && (arrInput[i] == newVal)){
                ++i;
                ++valCount;
            }
            // Store max appearance
            if (maxAppearance < valCount){
                maxAppearance = valCount;
                mode = arrInput[i - 1];
                valCount = 0;
            }
            // Get new value
            if (i < arrSize){
                newVal = arrInput[i];
                ++i;
            }
        }
        System.out.println("Mode: " + mode);
    }
}
