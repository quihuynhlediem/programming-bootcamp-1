package Day5;

import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        char inputChar = scnr.next().charAt(0);
        String inputStr = scnr.nextLine();
        int charCount = 0;

        for (char ch: inputStr.toCharArray()) {
            if (ch == inputChar){
                ++charCount;
            }
        }
        if (charCount == 1){
            System.out.println(charCount + " " + inputChar);
        }
        else {
            System.out.println(charCount + " " + inputChar + "'s");
        }
    }
}
