package ExtraDay7;

import java.util.Scanner;

public class Acronyms {

    public static String createAcronym(String userPhrase){
        String acronym = "";
        for (int i = 0; i < userPhrase.length(); ++i) {
            boolean isUpperLetter = (userPhrase.charAt(i) >= 'A') && (userPhrase.charAt(i) <= 'Z');
            if ((i == 0) || (isUpperLetter && Character.isWhitespace(userPhrase.charAt(i - 1)))){
                acronym = acronym + userPhrase.charAt(i) + ".";
            }
        }
        return acronym;
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String inputStr = scnr.nextLine();
        System.out.println(createAcronym(inputStr));
    }
}
