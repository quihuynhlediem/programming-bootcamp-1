package Day4;

import java.util.Scanner;

public class GameLeagues {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("              " + "Bronze        " + "Silver        " + "Gold          " + "Platinum      ");
        System.out.println("Score Range   " + "500 - 999     " + "1000 - 1999   " + "2000 - 2999   " + "3000 +        ");
        System.out.println();
        System.out.println("Please enter the user's score:");
        int userInput = scnr.nextInt();
        String league = "";

        if (userInput < 500) {
            System.out.println("You have not yet made it into a league");
        }
        else {
            if (userInput <= 999) {
                league = "Bronze";
            } else if (userInput <= 1999) {
                league = "Silver";
            } else if (userInput <= 2999) {
                league = "Gold";
            } else {
                league = "Platinum";
            }
            System.out.println("Congratulations you have made it into the " + league + "!!!");
        }
    }
}
