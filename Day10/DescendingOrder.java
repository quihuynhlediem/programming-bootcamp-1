package Day10;

import java.util.Scanner;

public class DescendingOrder {
    // TODO: Write a void method selectionSortDescendTrace() that takes
    //       an integer array and the number of elements in the array as arguments,
    //       and sorts the array into descending order.
    public static int[] selectionSortDescendTrace(int []inputArr, int endPoint){
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

            for (int i = 0; i < endPoint; i++) {
                System.out.print(inputArr[i] + " ");
            }
            System.out.println();
        }
        return inputArr;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input, i = 0;
        int numElements = 0;
        int [] numbers = new int[10];

        // TODO: Read in a list of up to 10 positive integers; stop when
        //       -1 is read. Then call selectionSortDescendTrace() method.
        int valInput = scnr.nextInt();
        while (valInput != -1) {
            numbers[numElements] = valInput;
            ++numElements;
            valInput = scnr.nextInt();
        }
        selectionSortDescendTrace(numbers, numElements);
    }
}
