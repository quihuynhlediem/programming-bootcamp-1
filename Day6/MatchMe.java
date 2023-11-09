package Day6;

import java.util.Scanner;
import java.util.Random;

public class MatchMe {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the number of elements to be paired.");
        int numRange = scnr.nextInt();
        System.out.println();
        int []numTable = new int[numRange * 2];

        //Print random numbers table
        int tableElement = 1;
        int index = 0;
        while(tableElement <= numRange){
            numTable[index] = tableElement;
            numTable[index + 1] = tableElement;
            index = index + 2;
            ++tableElement;
        }
        int printRows = (numRange % 5 == 0) ? ((numRange * 2) / 5) : (((numRange * 2) / 5) + 1);
        for (int i = 0; i < printRows; ++i){
            for (int j = 0; j < 5; ++j){
                index = j + (i * 5); // access the index of nth elements in numTable
                if (index < numTable.length) {
                    System.out.printf("%4d", numTable[index]);
                }
            }
            System.out.println();
        }
        System.out.println();

        // Output random table
        System.out.println("Please enter a seed number for testing purposes.");
        int seedVal = scnr.nextInt();
        System.out.println();
        Random randGen = new Random(seedVal);
        boolean []checkNumTable = new boolean[numRange * 2];
        for (int i = 0; i < printRows; ++i) {
            for (int j = 0; j < 5; ++j) {
                index = j + (i * 5); // access the index of nth elements in numTable
                if (index < numTable.length) {
                    int randomNum = randGen.nextInt(numRange * 2);
                    while (checkNumTable[randomNum]){
                        randomNum = randGen.nextInt(numRange * 2);
                    }
                    checkNumTable[randomNum] = true;
                    System.out.printf("%4d", numTable[randomNum]);
                }
            }
            System.out.println();
        }
    }
}