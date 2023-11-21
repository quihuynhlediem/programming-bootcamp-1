package ExtraDay5;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int inputVal = scnr.nextInt();
        for (int i = 0; i < inputVal; i++) {
            for (int j = 0; j <= (inputVal - i - 2); j++) {
                System.out.print("  "); // Print 2 whitespaces
                // If we only print 1 whitespace, we have isosceles triangle (tam giac can)
            }
            for (int j = (inputVal - i - 1); j < inputVal; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
