package Day2;

import java.util.Scanner;

public class ProgramSummary {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        char char1, char2, char3, char4, char5;
        String singleWord;

        System.out.println("Prompt the user to input the first character:");
        char1 = scnr.nextLine().charAt(0);
        System.out.println("Prompt the user to input the second character:");
        char2 = scnr.nextLine().charAt(0);
        System.out.println("Prompt the user to input the third character:");
        char3 = scnr.nextLine().charAt(0);
        System.out.println("Prompt the user to input the fourth character:");
        char4 = scnr.nextLine().charAt(0);
        System.out.println("Prompt the user to input the fifth character:");
        char5 = scnr.nextLine().charAt(0);
        System.out.println("Please enter a single word consisting of exactly five characters:");
        singleWord = scnr.nextLine();

        char concatenateChar1 = singleWord.charAt(0);
        char concatenateChar2 = singleWord.charAt(1);
        char concatenateChar3 = singleWord.charAt(2);
        char concatenateChar4 = singleWord.charAt(3);
        char concatenateChar5 = singleWord.charAt(4);

        System.out.println("Answer:" + char1 + char2 + char3 + char4 + char5);
        System.out.printf("Answer:\n%c\n%c\n%c\n%c\n%c\n", concatenateChar1, concatenateChar2, concatenateChar3, concatenateChar4, concatenateChar5);
        scnr.close();
    }
}
