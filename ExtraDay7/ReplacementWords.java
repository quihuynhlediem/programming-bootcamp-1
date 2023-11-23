package ExtraDay7;

import java.util.Scanner;

public class ReplacementWords {

    public static void readSentences(Scanner scnr, String[] sentence1Words, String[] sentence2Words, int wordCount){
        for (int i = 0; i < wordCount; i++) {
            String word = scnr.next();
            sentence1Words[i] = word;
        }

        for (int i = 0; i < wordCount; i++) {
            String word = scnr.next();
            sentence2Words[i] = word;
        }
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int wordCount = scnr.nextInt();
        String [] sentence1 = new String[wordCount];
        String [] sentence2 = new String[wordCount];
        readSentences(scnr, sentence1, sentence2, wordCount);
        for (int i = 0; i < wordCount; i++) {
            if (!sentence1[i].equals(sentence2[i])){
                System.out.println(sentence1[i] + " " + sentence2[i]);
            }
        }
    }
}
