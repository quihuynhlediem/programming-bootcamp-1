package ExtraDay1;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int []a = new int[n];
        int [][]b = new int[n][n];
        int []c = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = scnr.nextInt();
        }
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j) {
                b[i][j] = scnr.nextInt();
            }
        }

        for (int i = 0; i < n; ++i){ // id của c
            for (int j = 0; j < n; ++j) {
                c[i] += (a[j] * b[j][i]);
            }
        }

        for (int i = 0; i < n; ++i){
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
