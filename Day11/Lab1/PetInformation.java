package Day11.Lab1;

import Day11.Lab1.Cat;
import Day11.Lab1.Dog;
import Day11.Lab1.Pet;

import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String petType = scnr.nextLine();
        String petName = scnr.nextLine();
        int petAge = scnr.nextInt();


        Pet pet = null;

        if (petType.equals("Dog")){
            pet = new Dog(petType, petName, petAge);
            pet.printInfo();
        }
        else if (petType.equals("Cat")){
            pet = new Cat(petType, petName, petAge);
            pet.printInfo();
        }
        else {
            System.out.println("Unknown animal");
        }


    }
}


