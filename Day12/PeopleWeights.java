package Day12;

import java.util.Scanner;

public class PeopleWeights {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double []peopleWeight = new double[5];
        double totalWeight = 0.0;
        double averageWeight;
        double maxWeight = 0.0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter weight %d:\n", i + 1);
            peopleWeight[i] = scnr.nextDouble();
            totalWeight += peopleWeight[i];
            if (maxWeight < peopleWeight[i]){
                maxWeight = peopleWeight[i];
            }
        }

        System.out.print("You entered: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(peopleWeight[i] + " ");
        }
        System.out.println();
        averageWeight = totalWeight / 5;

        System.out.println();
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight: " + averageWeight);
        System.out.println("Max weight: " + maxWeight);
    }
}
