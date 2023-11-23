package Day11.Lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {

    public static void typeSelectionSort(ArrayList<FoodItem> foodItemArrayList){
        String minType;
        int minIndex = 0;
        for (int i = 0; i < foodItemArrayList.size() - 1; i++) {
            minType = foodItemArrayList.get(i).type;
            minIndex = i;
            for (int j = i + 1; j < foodItemArrayList.size(); j++) {
                String currType = foodItemArrayList.get(j).type;
                if (minType.compareTo(currType) > 0){
                    minType = currType;
                    minIndex = j;
                }
            }
            FoodItem temp = foodItemArrayList.get(i);
            foodItemArrayList.set(i, foodItemArrayList.get(minIndex));
            foodItemArrayList.set(minIndex, temp);
        }
    }

    public static void nameSelectionSort(ArrayList<FoodItem> foodItemArrayList, int startIndex, int endIndex){
        String minType;
        int minIndex = startIndex;
        for (int i = startIndex; i < endIndex - 1; i++) {
            minType = foodItemArrayList.get(i).name;
            minIndex = i;
            for (int j = i + 1; j < endIndex; j++) {
                String currType = foodItemArrayList.get(j).name;
                if (minType.compareTo(currType) > 0){
                    minType = currType;
                    minIndex = j;
                }
            }
            FoodItem temp = foodItemArrayList.get(i);
            foodItemArrayList.set(i, foodItemArrayList.get(minIndex));
            foodItemArrayList.set(minIndex, temp);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        System.out.println("Please input the name of the text file.");
        String filename = scnr.nextLine();
        scnr.close();
        System.out.println();
        FileInputStream fileByteStream = new FileInputStream("Day11/Lab2/" + filename);
        Scanner scan = new Scanner(fileByteStream);
        ArrayList<FoodItem> foodItemArrayList = new ArrayList<FoodItem>();

        while (scan.hasNextLine()){
            String input = scan.nextLine();
            String []inputArr = input.split("\t");
            String type = inputArr[0];
            String name = inputArr[1];
            String description = inputArr[2];
            boolean available = false;
            if (inputArr[3].equals("Available")) {
                available = true;
            }

            FoodItem food = new FoodItem(type, name, description, available);
            foodItemArrayList.add(food);
        }

        for (int i = 0; i < foodItemArrayList.size(); i++) {
            if (foodItemArrayList.get(i).available) {
                System.out.println(foodItemArrayList.get(i).getDescription());
            }
        }

        //Sort base on type
        System.out.println("\n");
        System.out.println("Sorted (Category)");
        typeSelectionSort(foodItemArrayList);
        for (int i = 0; i < foodItemArrayList.size(); i++) {
            if (foodItemArrayList.get(i).available) {
                System.out.println(foodItemArrayList.get(i).categoryAndName());
            }
        }

        //Sort base on type and name
        //Sort base on type
        System.out.println("\n");
        System.out.println("Sorted (Category & Name)");
        int i = 0;
        while (i < foodItemArrayList.size()){
            int startIndex = i;
            String previousType = foodItemArrayList.get(startIndex).type;
            int endIndex = i + 1;
            // Limit to avoid out of index by (endIndex < foodItemArrayList.size())
            while (endIndex < foodItemArrayList.size() && foodItemArrayList.get(endIndex).type.equals(previousType)){
                ++endIndex;
            }
            nameSelectionSort(foodItemArrayList, startIndex, endIndex);
            i = endIndex;
        }

        for (i = 0; i < foodItemArrayList.size(); i++) {
            if (foodItemArrayList.get(i).available) {
                System.out.println(foodItemArrayList.get(i).categoryAndName());
            }
        }
    }
}