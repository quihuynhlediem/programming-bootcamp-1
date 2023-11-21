package ExtraDay5;

import java.util.Scanner;

public class NonAlphaChar {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String inputStr = scnr.nextLine();
        String outputStr= "";
        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isLetter(inputStr.charAt(i))){
                outputStr += inputStr.charAt(i);
            }
        }
        System.out.println(outputStr);
    }
}
