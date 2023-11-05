package Day4;

import java.util.Scanner;

public class EventPlanning {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter expected temperature, rain and humidity for Day 1:");
        double temp1 = scnr.nextDouble();
        int rain1 = scnr.nextInt();
        int humidity1 = scnr.nextInt();
        System.out.println("Please enter expected temperature, rain and humidity for Day 2:");
        double temp2 = scnr.nextDouble();
        int rain2 = scnr.nextInt();
        int humidity2 = scnr.nextInt();
        System.out.println();

        //Scoring for temperature
        int tempScore1;
        int tempScore2;
        boolean tempEqual1 = ((temp1 - 15) <= 0.001) && ((26 - temp1) >= 0.001);
        boolean tempEqual2 = ((temp2 - 15) <= 0.001) && ((26 - temp2) >= 0.001);

        if (temp1 < 15)
            tempScore1 = 2;
        else if (tempEqual1 || ((temp1 > 15) && (temp1 < 26)))
            tempScore1 = 3;
        else
            tempScore1 = 1;

        if (temp2 < 15)
            tempScore2 = 2;
        else if (tempEqual2 || ((temp2 > 15) && (temp2 < 26)))
            tempScore2 = 3;
        else
            tempScore2 = 1;

        //Scoring for rain
        int rainScore1;
        int rainScore2;

        if ((rain1 >= 0) && (rain1 <= 3))
            rainScore1 = 3;
        else if (rain1 <= 8)
            rainScore1 = 2;
        else
            rainScore1 = 1;

        if ((rain2 >= 0) && (rain2 <= 3))
            rainScore2 = 3;
        else if (rain2 <= 8)
            rainScore2 = 2;
        else
            rainScore2 = 1;

        //Scoring for humidity
        int humidScore1;
        int humidScore2;

        if ((humidity1 >= 0) && (humidity1 <= 45))
            humidScore1 = 3;
        else if (humidity1 <= 60)
            humidScore1 = 2;
        else
            humidScore1 = 1;

        if ((humidity2 >= 0) && (humidity2 <= 45))
            humidScore2 = 3;
        else if (humidity2 <= 60)
            humidScore2 = 2;
        else
            humidScore2 = 1;

        //Total scoring
        int totalScore1 = (tempScore1 * 3) + (rainScore1 * 2) + humidScore1;
        int totalScore2 = (tempScore2 * 3) + (rainScore2 * 2) + humidScore2;

        System.out.println("Outcome score day 1: " + (double) totalScore1);
        System.out.println("Outcome score day 2: " + (double) totalScore2);
        System.out.print("The best day to hold your event is: ");
        if (totalScore1 > totalScore2){
            System.out.println("Day 1");
        } else if (totalScore1 < totalScore2){
            System.out.println("Day 2");
        } else {
            System.out.println("Day 1 or Day 2");
        }
    }
}
