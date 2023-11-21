package ExtraDay5;

import java.util.Scanner;

public class DownTriangle {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int inputVal = scnr.nextInt();
        for (int i = 0; i < inputVal; i++) {
            for (int j = 0; j < (inputVal - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
