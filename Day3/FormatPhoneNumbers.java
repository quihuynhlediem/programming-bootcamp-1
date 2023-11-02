package Day3;

import java.util.Scanner;

public class FormatPhoneNumbers {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        long mobilePhoneNumber;
        long landlinePhoneNumber;
        long tempNumber;
        long lastFour;
        long firstFour;
        long lastThree;
        long firstThree;
        long prefixNumber;

        System.out.println("Please enter the landline phone number:");
        landlinePhoneNumber = scnr.nextLong();
        System.out.println("Please enter the mobile phone number:");
        mobilePhoneNumber = scnr.nextLong();
        System.out.println();

        //Landline number
        tempNumber = landlinePhoneNumber;

        lastFour = tempNumber % 10000;
        tempNumber = tempNumber / 10000;

        firstFour = tempNumber % 10000;
        prefixNumber = tempNumber / 10000;

        System.out.printf("Your landline number is: %+d %d %d\n", prefixNumber, firstFour, lastFour);

        // Mobile number
        tempNumber = mobilePhoneNumber;

        lastThree = tempNumber % 1000;
        tempNumber = tempNumber / 1000;

        firstThree = tempNumber % 1000;
        prefixNumber = tempNumber / 1000;

        System.out.printf("Your mobile number is: %04d %d %d\n", prefixNumber, firstThree, lastThree);

    }
}
