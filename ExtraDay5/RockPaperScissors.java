package ExtraDay5;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int seed = scnr.nextInt();
        String player1 = scnr.next();
        String player2 = scnr.next();
        int roundNum;
        Random rand = new Random(seed);
        String[] RSP = {"rock", "paper", "scissors"};
        int output1, output2; //Store random numbers
        int score1 = 0;
        int score2 = 0;
        while (scnr.hasNext()) {
            roundNum = scnr.nextInt();
            if (roundNum < 1){
                System.out.println("Rounds must be > 0");
            }
            else {
                System.out.println(player1 + " vs " + player2 + " for " + roundNum + " rounds");
                while (roundNum > 0) {
                    output1 = rand.nextInt(3);
                    output2 = rand.nextInt(3);
                    if (output1 == output2) {
                        System.out.println("Tie");
                    } else if (output1 < output2) {
                        if ((output1 == 0) && (output2 == 2)) {
                            System.out.printf("%s wins with %s\n", player1, RSP[output1]);
                            --roundNum;
                            ++score1;
                        } else {
                            System.out.printf("%s wins with %s\n", player2, RSP[output2]);
                            --roundNum;
                            ++score2;
                        }
                    } else {
                        if ((output1 == 2) && (output2 == 0)) {
                            System.out.printf("%s wins with %s\n", player2, RSP[output2]);
                            --roundNum;
                            ++score2;
                        } else {
                            System.out.printf("%s wins with %s\n", player1, RSP[output1]);
                            --roundNum;
                            ++score1;
                        }
                    }

                }
                System.out.printf("%s wins %d and %s wins %d\n", player1, score1, player2, score2);
            }
        }
    }
}
