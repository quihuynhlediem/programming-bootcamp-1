package Day7;

import java.util.Scanner;

public class UnitTest {

    public static double kiloToPounds(double kilos) {
        // This statement intentionally has an error.
        return (kilos * 2.204);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double kilos;
        double pounds;

        kilos = scnr.nextDouble();

        pounds = kiloToPounds(kilos);
        System.out.println(pounds + " lbs");
    }
}