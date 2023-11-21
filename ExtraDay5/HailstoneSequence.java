package ExtraDay5;

import java.util.Scanner;

public class HailstoneSequence {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int input = scnr.nextInt();
        int numCount = 0;
        while (input != 1) {
            System.out.printf("%d\t", input);
            if (input % 2 == 0){
                input /= 2;
            }
            else {
                input = 3 * input + 1;
            }
            ++numCount;
            if (numCount == 10){
                System.out.println();
                numCount = 0;
            }
        }
        System.out.printf("%d\t", input);
    }
}
