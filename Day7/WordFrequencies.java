package Day7;

import java.util.Scanner;

public class WordFrequencies {

    public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
        int count = 0;
        currWord = currWord.toLowerCase();
        for (int i = 0; i < listSize; i++) {
            if (wordsList[i].toLowerCase().equals(currWord))
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        String [] wordArr = new String[arrSize];
        for (int i = 0; i < arrSize; i++) {
            wordArr[i] = scnr.next();
        }

        for (int i = 0; i < arrSize; i++) {
            int currWordCount = getWordFrequency(wordArr, arrSize, wordArr[i]);
            System.out.println(wordArr[i] + " " + currWordCount);
        }
    }
}
