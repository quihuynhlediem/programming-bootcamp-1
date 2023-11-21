package Demo;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int rows = scnr.nextInt();
        int columns = 1 + (rows -1) * 2;
        String [][] christmasArr = new String[rows][columns];

        // Khoi tao mang voi toan whitespaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                christmasArr[i][j] = " ";
            }
        }

        // Modify the arr
        for (int i = 0; i < rows; i++) {
            for (int j = (columns / 2 - i); j < columns / 2 + i + 1; j++) {
                christmasArr[i][j] = "*";
            }
        }

        //Output the Christmas Tree
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(christmasArr[i][j]);
            }
            System.out.println();
        }
    }
}
