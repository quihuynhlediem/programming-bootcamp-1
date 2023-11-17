package ExtraDay6;

import java.util.Scanner;

public class NthFromEnd {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int []arrInput = new int[20];
        int arrSize = 0;
        int value = scnr.nextInt();
        while (value > 0){
            arrInput[arrSize] = value;
            ++arrSize;
            value = scnr.nextInt();
        }
        int n = value;
        if (-n > arrSize){
            System.out.println(n);
        }
        else {
            System.out.println(arrInput[arrSize + n]);
        }
    }
}
