package ExtraDay7;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenNumbers {
    public static int[] removeEvens(int [] nums) {
        int oddNumCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                ++oddNumCount;
            }
        }
        int addOddNumCount = 0;
        int []oddNumArr = new int[oddNumCount];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                oddNumArr[addOddNumCount] = nums[i];
                ++addOddNumCount;
            }
            if (addOddNumCount == oddNumCount){
                break;
            }
        }
        return oddNumArr;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int [] input = {-1,9,3};
        int [] result = removeEvens(input);

        System.out.println(Arrays.toString(result));
    }
}
