package ExtraDay7;

import java.util.Scanner;
import java.util.Arrays;

public class PokerDice {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int diceValues[] = new int[5];
        int highScore = 0;

        // Fill array with five values from input
        for(int i=0; i<diceValues.length; ++i) {
            diceValues[i] = scnr.nextInt();
        }

        // Place values in ascending order
        Arrays.sort(diceValues);

        // Find high score and output
        highScore = findHighScore(diceValues);
        System.out.println("High score: " + highScore);
    }

    // Find high score
    public static int findHighScore(int dice[]) {
        /* Complete the method and update the return statement */
        int highestScore = 0;
        for (int i = 1; i <= 6; i++) {
            int currScore = checkSingles(dice, i);
            if (currScore > highestScore){
                highestScore = currScore;
            }
        }
        if (highestScore < checkThreeOfKind(dice)){
            highestScore = checkThreeOfKind(dice);
        }
        if (highestScore < checkFourOfKind(dice)){
            highestScore = checkFourOfKind(dice);
        }
        if (highestScore < checkFiveOfKind(dice)){
            highestScore = checkFiveOfKind(dice);
        }
        if (highestScore < checkFullHouse(dice)){
            highestScore = checkFullHouse(dice);
        }
        if (highestScore < checkStraight(dice)){
            highestScore = checkStraight(dice);
        }
        return highestScore;
    }

    // Add all occurences of goal value
    public static int checkSingles(int dice[], int goal) {
        /* Complete the method and update the return statement */
        int singleSum = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == goal){
                singleSum += goal;
            }
        }
        return singleSum;
    }

    // Check for three of a kind (score = 30)
    public static int checkThreeOfKind(int dice[]) {
        /* Complete the method and update the return statement */
        int []diceCount = new int[6];
        for (int i = 0; i < dice.length; i++) {
            ++diceCount[dice[i] - 1];
        }
        for (int i = 0; i < 6; i++) {
            if (diceCount[i] == 3){
                return 30;
            }
        }
        return 0;
    }

    // Check for four of a kind (score = 40)
    public static int checkFourOfKind(int dice[]) {
        /* Complete the method and update the return statement */
        int []diceCount = new int[6];
        for (int i = 0; i < dice.length; i++) {
            ++diceCount[dice[i] - 1];
        }
        for (int i = 0; i < 6; i++) {
            if (diceCount[i] == 4){
                return 40;
            }
        }
        return 0;
    }

    // Check for five of a kind (score = 50)
    public static int checkFiveOfKind(int dice[]) {
        /* Complete the method and update the return statement */
        int []diceCount = new int[6];
        for (int i = 0; i < dice.length; i++) {
            ++diceCount[dice[i] - 1];
        }
        for (int i = 0; i < 6; i++) {
            if (diceCount[i] == 5){
                return 50;
            }
        }
        return 0;
    }

    // Check for full house (score = 35)
    public static int checkFullHouse(int dice[]) {
        if (checkFiveOfKind(dice) == 50){
            return 35;
        }
        int []diceCount = new int[6];
        for (int i = 0; i < dice.length; i++) {
            ++diceCount[dice[i] - 1];
        }
        boolean checkTwo = false;
        boolean checkThree = false;
        for (int i = 0; i < 6; i++) {
            if (diceCount[i] == 3){
                checkThree = true;
            }
            if (diceCount[i] == 2){
                checkTwo = true;
            }
            if (checkThree && checkTwo){
                return 35;
            }
        }
        /* Complete the method and update the return statement */
        return 0;
    }

    // Check for straight (score = 45)
    public static int checkStraight(int dice[]) {
        /* Complete the method and update the return statement */
        boolean checkStraight = true;
        for (int i = 0; i < dice.length - 1; i++) {
            if (dice[i] >= dice[i + 1]){
                checkStraight = false;
                break;
            }
        }
        if (checkStraight == true) {
            return 45;
        }
        else {
            return 0;
        }
    }
}


