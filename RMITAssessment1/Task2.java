package RMITAssessment1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a customer id: ");
        int id = scnr.nextInt();

        String temp = scnr.nextLine();
        System.out.println("Please enter customer full name: ");
        String fullName = scnr.nextLine();

        System.out.println("Already purchased this month (true or false): ");
        boolean purchasedThisMonth = scnr.nextBoolean();

        int monthsSincePurchase = 0;

        //Debug here
        if (!purchasedThisMonth) {
            System.out.println("Please enter number of months since last purchase: ");
            scnr.nextLine();
            monthsSincePurchase = scnr.nextInt();
        }
        // Debug here

        System.out.println("Is a member (true or false): ");
        boolean member = scnr.nextBoolean();

        System.out.println();

        String format = "%-25s%s%n";
        String firstLine = String.format(format, "ID:", id);
        String secondLine = String.format(format, "Full Name:", fullName);

        // Debug here
        String thirdLine;
        if (purchasedThisMonth) {
            thirdLine = String.format(format, "Purchased (this month):", "TRUE");
        } else {
            thirdLine = String.format(format, "Purchased (this month):", "FALSE");
        }
        String fourthLine = String.format(format, "Months since purchase:", monthsSincePurchase);
        String fifthLine;
        if (member) {
            fifthLine = String.format(format, "Member:", "TRUE");
        } else {
            fifthLine = String.format(format, "Member:", "FALSE");
        }
        // Debug ends

        String purchaseStatus = purchasedThisMonth ? thirdLine : fourthLine;
        System.out.println(firstLine + secondLine + purchaseStatus + fifthLine);

        //Debug here
        if (!purchasedThisMonth && !member) {
            System.out.println("We have noticed that you have not made a purchase this month, we would like to offer you a 50% discount on becoming a member, if you make a purchase within the next 7 days.");
        } else if (purchasedThisMonth && !member) {
            System.out.println("We have noticed that you have made another purchase, we would like to offer you a 25% discount on becoming a member.");
        } else if (member && !purchasedThisMonth) {
            System.out.println("You are a valued customer and we have noticed that you have not made a purchase this month. We would like to offer you a 25% discount on your next purchase, we would love to see you as an active member again.");
        } else {
            System.out.println("We hope you are enjoying all your membership benefits, please let us know if there is anything we can do to improve our services.");
        }
        //Debug ends
    }
}