package ExtraDay8.Lab2;

public class LabProgram {

    public static int flipForTails(GVCoin c, int goal){
        /* Type your code here. */
        while (c.numTails() < goal){
            c.flip();
        }
        return c.numFlips();
    }

    // This method creates a GVCoin object and calls the method for testing
    public static void main(String[] args) {
        GVCoin c = new GVCoin(15);   // Create a GVCoin object with seed value 15
        int numTails = 100;   // Desire 100 tails
        int total = flipForTails(c, numTails); // Should return 216 using GVCoin object with seed value 15
        System.out.println("Total number of flips for 100 tails: " + total);
    }
}

