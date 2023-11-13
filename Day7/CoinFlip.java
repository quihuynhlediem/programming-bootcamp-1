package Day7;

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {

    public static String coinFlip(Random rand){
    int randomNum = rand.nextInt(2);
        if (randomNum == 0){
            return "Tails";
        }
        else {
            return "Heads";
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Unique seed
        int flipNum = scnr.nextInt();

        for (int i = 0; i < flipNum; ++i){
            System.out.println(coinFlip(rand));
        }
    }
}
