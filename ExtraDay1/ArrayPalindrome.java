package ExtraDay1;

import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int []arrInput = new int[arrSize];
        for (int i = 0; i < arrSize; ++i){
            arrInput[i] = scnr.nextInt();
        }

        boolean isPalindrome = true;
        for (int i = 0; i < (arrSize / 2); ++i){
            if (arrInput[i] != arrInput[arrSize - i - 1]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
