package Day9.Lab4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

    // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
    public static void printArrayList(ArrayList<Plant> myGarden) {
        for (int i = 0; i < myGarden.size(); ++i){
            System.out.println("Plant " + (i + 1) + " Information");
            myGarden.get(i).printInfo();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();

        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
        String plantName;
        String plantCost;
        String flowerName;
        String flowerCost;
        String colorOfFlowers;
        boolean isAnnual;

        input = scnr.next();
        while(!input.equals("-1")){
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden
            if (input.equals("plant")){
                Plant newPlant = new Plant();
                plantName = scnr.next();
                newPlant.setPlantName(plantName);
                plantCost = scnr.next();
                newPlant.setPlantCost(plantCost);
                myGarden.add(newPlant);
            }
            else {
                Flower newFlower = new Flower();
                flowerName = scnr.next();
                newFlower.setPlantName(flowerName);
                flowerCost = scnr.next();
                newFlower.setPlantCost(flowerCost);
                isAnnual = scnr.nextBoolean();
                newFlower.setPlantType(isAnnual);
                colorOfFlowers = scnr.next();
                newFlower.setColorOfFlowers(colorOfFlowers);
                myGarden.add(newFlower);
            }

            input = scnr.next();
        }

        // TODO: Call the method printArrayList to print myGarden
        printArrayList(myGarden);
    }
}

