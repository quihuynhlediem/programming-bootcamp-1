package Day1;

import java.util.Scanner;

public class ThreeNames {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the first student name and press the enter key.");
        String name1 = scnr.nextLine();
        System.out.println("Please enter the second student name and press the enter key.");
        String name2 = scnr.nextLine();
        System.out.println("Please enter the third student name and press the enter key.");
        String name3 = scnr.nextLine();

        System.out.println(name1 + ", " + name2 + ", " + name3);

        scnr.close();
    }
}
