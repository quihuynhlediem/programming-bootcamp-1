package Day2;

import java.util.Scanner;

public class ProgrammingSummarDebugingSkills {
        public static void main(String[] args){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the room capacities for each of the four rooms: ");

            int firstRoom = userInput.nextInt();
            int secondRoom = userInput.nextInt();
            int thirdRoom = userInput.nextInt();
            int fourthRoom = userInput.nextInt();

            int sum = firstRoom + secondRoom + thirdRoom + fourthRoom;
            double average = (double) (firstRoom + secondRoom + thirdRoom + fourthRoom) / 4.0;

            System.out.println("The total number of people that can be accommodated by these four rooms are: " + sum);
            System.out.println("The average number of people that a room can accommodate is: " + average);
            userInput.close();
    }
}
