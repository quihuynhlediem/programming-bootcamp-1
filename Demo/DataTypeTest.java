package Demo;

import java.util.Scanner;

public class DataTypeTest {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int sideLength;
            long cubeVolume;

            System.out.println("Enter cube's side length: ");
            sideLength = scnr.nextInt();

            cubeVolume = (long) (sideLength * sideLength * sideLength); // cubeVolume is int now =>
            //cubeVolume = 20000000000L;


            System.out.println("Cube's volume is: " + cubeVolume);
        }

}
/*
sideLength * sideLength * sideLength:
integer multiplication implicitly cast to long
 */