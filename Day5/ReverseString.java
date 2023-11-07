package Day5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String inputStr = scnr.nextLine();

        while ((!inputStr.equals("Done")) && (!inputStr.equals("done")) && (!inputStr.equals("d"))){
            String reverseStr = "";
            for (int i = inputStr.length() - 1; i >= 0; --i){
                reverseStr = reverseStr + inputStr.charAt(i);
            }
            System.out.println(reverseStr);
            inputStr = scnr.nextLine();
        }
    }
}
