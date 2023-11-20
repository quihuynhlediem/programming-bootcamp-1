package Day10;

import java.util.Scanner;

public class ArraySort {
    public static void sortArray(int []inputArr, int endPoint){
        for (int j = 0; j < endPoint - 1; ++j){
            int max = inputArr[j];
            int maxIndex = j;
            for (int i = j + 1; i < endPoint; i++) {
                if (max < inputArr[i]){
                    max = inputArr[i];
                    maxIndex = i;
                }
            }
            if (maxIndex != j) {
                int temp;
                temp = inputArr[j];
                inputArr[j] = inputArr[maxIndex];
                inputArr[maxIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numElements = scnr.nextInt();
        int [] numbers = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            numbers[i] = scnr.nextInt();
        }
        sortArray(numbers, numElements);
        for (int value : numbers) {
            System.out.print(value + ",");
        }
        System.out.println();
    }
}
