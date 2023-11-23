package Day12;

import java.util.Arrays;

public class RemoveEvenNum {

    public static int[] removeEvens(int[] inputArr) {
        int oddNumCount = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 == 1) {
                ++oddNumCount;
            }
        }
        int[] outputArr = new int[oddNumCount];
        int addToArrCount = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 == 1) {
                outputArr[addToArrCount] = inputArr[i];
                ++addToArrCount;
            }
        }
        return outputArr;
    }

    public static void main(String[] args) {

        int [] input = {1,2,3,4,5,6,7,8,9};
        int [] result = removeEvens(input);

        // Helper method Arrays.toString() converts int[] to a String
        System.out.println(Arrays.toString(result)); // Should print [1, 3, 5, 7, 9]
    }
}
