package Day6;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args){
        int count = 0;
        String SECRET_WORD = "enjoy";
        Scanner scnr = new Scanner(System.in);
        String inputStr;
        while (count < 6){
            if (count == 0){
                System.out.println("Please enter your first attempt.");
            }
            else {
                System.out.println("Please try again: ");
            }
            inputStr = scnr.nextLine();
            String checkStr = "";
            int lexico = 0;
            boolean allTrue = true;
            for (int i = 0; i < 5; ++i){
                if (inputStr.charAt(i) == SECRET_WORD.charAt(i)){
                    checkStr += inputStr.charAt(i);
                }
                else {
                    allTrue = false;
                    if (SECRET_WORD.indexOf(inputStr.charAt(i)) >= 0){
                        lexico = Math.abs(inputStr.charAt(i) - SECRET_WORD.charAt(i));
                        checkStr += "(" + inputStr.charAt(i) + ")";
                    }
                    else {
                        checkStr += "X";
                    }
                }
            }
            if (allTrue){
                System.out.println(inputStr);
                System.out.print("Congratulations, you found the word.");
                break;
            }
            else{
                if (count < 5) {
                    System.out.println(inputStr);
                    System.out.println(checkStr);
                    if (lexico > 0){
                        System.out.printf("One of your letters is %d characters away\n", lexico);
                    }
                }
                else {
                    System.out.println();
                    System.out.println("Better luck next time");
                }
            }
            System.out.println();
            count++;
        }
    }
}
