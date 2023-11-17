package ExtraDay1;

import java.util.Scanner;

public class PlayerRoster {

    public static void printMenu(){
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");
    }
    public static void printRoster(int []jerseyNum, int []rating){
        System.out.println("ROSTER");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", i + 1, jerseyNum[i], rating[i]);
        }
    }

    public static void updatePlayerRating(int []jerseyNum, int []rating, Scanner scnr){
        System.out.println("Enter a jersey number:");
        int updateJerseyNum = scnr.nextInt();
        System.out.println("Enter a new rating for player:");
        int updateRating = scnr.nextInt();
        for (int i = 0; i < 5; i++) {
            if (jerseyNum[i] == updateJerseyNum){
                rating[i] = updateRating;
                //System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", i + 1, jerseyNum[i], rating[i]);
                break;
            }
        }
    }

    public static void printPlayerAboveRating(int []jerseyNum, int []rating, Scanner scnr){
        System.out.println("Enter a rating:");
        int ratingStandard = scnr.nextInt();
        System.out.printf("ABOVE %d\n", ratingStandard);
        for (int i = 0; i < 5; i++) {
            if (rating[i] > ratingStandard){
                System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", i + 1, jerseyNum[i], rating[i]);
            }
        }
    }

    public static void replacePlayer(int []jerseyNum, int []rating, Scanner scnr) {
        System.out.println("Enter a jersey number:");
        int replaceNum = scnr.nextInt();

        // If inputs are not enough, stop the function
        if (!scnr.hasNextInt()){
            return;
        }

        System.out.println("Enter a new jersey number:");
        int newJerseyNum = scnr.nextInt();
        System.out.println("Enter a rating for the new player:");
        int newRating = scnr.nextInt();

        for (int i = 0; i < 5; i++) {
            if (jerseyNum[i] == replaceNum){
                jerseyNum[i] = newJerseyNum;
                rating[i] = newRating;
                //System.out.printf("Player %d -- Jersey number: %d, Rating: %d\n", i + 1, jerseyNum[i], rating[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int []jerseyNum = new int[5];
        int []rating = new int[5];

        // Get input
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter player %d's jersey number:\n", i + 1);
            jerseyNum[i] = scnr.nextInt();
            System.out.printf("Enter player %d's rating:\n", i + 1);
            rating[i] = scnr.nextInt();
            System.out.println();
        }

        // Print roster
        printRoster(jerseyNum, rating);
        System.out.println();

        // Print menu
        printMenu();

        // Implement menu
        char userInput = scnr.next().charAt(0);
        while (userInput != 'q') {
            // Output roster

            if (userInput == 'o') {
                printRoster(jerseyNum, rating);
            }

            //Update player rating
            if (userInput == 'u') {
                updatePlayerRating(jerseyNum, rating, scnr);
            }

            // Output players above a rating
            if (userInput == 'a') {
                printPlayerAboveRating(jerseyNum, rating, scnr);
            }

            // Replace player
            if (userInput == 'r') {
                replacePlayer(jerseyNum, rating, scnr);
            }

            System.out.println();

            printMenu();
            userInput = scnr.next().charAt(0);
        }

    }
}