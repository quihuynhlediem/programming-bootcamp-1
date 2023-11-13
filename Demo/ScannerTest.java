package Demo;

import java.util.Scanner;

public class ScannerTest {
    public static int readInt() {
        Scanner scnr = new Scanner(System.in);

        return scnr.nextInt();
    }
    public static void main(String[] args){
        int sum1 = readInt() ;
        int sum2 = readInt();
    }
}
