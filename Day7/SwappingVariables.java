package Day7;

import java.util.Scanner;

public class SwappingVariables {
    public static void swapValues(int []paraArr){
        int temp;
        //Swap numbers at index 0 and 1
        temp = paraArr[0];
        paraArr[0] = paraArr[1];
        paraArr[1] = temp;

        //Swap numbers at index 2 and 3
        temp = paraArr[2];
        paraArr[2] = paraArr[3];
        paraArr[3] = temp;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int []inputArr = new int[4];
        for (int i = 0; i < inputArr.length; ++i){
            inputArr[i] = scnr.nextInt();
        }

        swapValues(inputArr);

        for (int i = 0; i < inputArr.length; ++i){
            if (i == (inputArr.length - 1)){
                System.out.println(inputArr[i]);
            } else{
                System.out.print(inputArr[i] + " ");
            }
        }
    }
}
