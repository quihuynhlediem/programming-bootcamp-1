package Day3;

import java.util.Scanner;

public class CharityFoodOrder {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int peopleNum;
        int mealsPerPerson;
        double costPerBag;
        double lateOrderPercentage;
        int CUPS_PER_BAG = 12;

        //Step 1
        System.out.println("Number of people:");
        peopleNum = scnr.nextInt();
        System.out.println("Number of meals per person:");
        mealsPerPerson = scnr.nextInt();
        System.out.println("Cost per bag of rice:");
        costPerBag = scnr.nextDouble();
        System.out.println();

        int totalMeals = peopleNum * mealsPerPerson;
        int riceBagsNum = (totalMeals / CUPS_PER_BAG);
        if (totalMeals % CUPS_PER_BAG != 0){
            riceBagsNum++;
        }
        double totalCost = riceBagsNum * costPerBag;

        System.out.printf("This order will support %d people to each make %d rice based meals.\n", peopleNum, mealsPerPerson);
        System.out.printf("Total meals: %d\n", totalMeals);
        System.out.printf("You will need %d bags of rice for a cost of $%.2f.\n", riceBagsNum, totalCost);
        System.out.println();

        System.out.println("Please input the expected percentage of late orders:");
        lateOrderPercentage = scnr.nextDouble();
        System.out.println();

        //Step 2
        int lateOrderPeople = (int) Math.round(lateOrderPercentage * (double) peopleNum);
        peopleNum = peopleNum + lateOrderPeople;
        totalMeals = peopleNum * mealsPerPerson;
        riceBagsNum = (totalMeals / CUPS_PER_BAG);
        if (totalMeals % CUPS_PER_BAG != 0){
            riceBagsNum++;
        }
        totalCost = riceBagsNum * costPerBag;

        System.out.printf("Allowing for late orders, you should order: %d bags of rice for a cost of $%.2f.", riceBagsNum, totalCost);

    }
}
