package Demo;

import java.util.Scanner;
public class ScannerTrial {
    public static void main(String[] args){
       String input = "Good morning everyone!";
       Scanner scnr = new Scanner(input);
       String token1;
       token1 = scnr.nextLine();
       System.out.print(token1);
       scnr.close();
    }
}
