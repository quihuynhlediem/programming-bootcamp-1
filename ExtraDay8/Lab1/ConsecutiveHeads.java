package ExtraDay8.Lab1;

public class ConsecutiveHeads {

    public static int consecutiveHeads(GVCoin c, int goal) {
        /* Type your code here. */
        int consecutiveHead = 0;
        while (consecutiveHead < goal){
            c.flip();
            if (c.isHeads()){
                consecutiveHead++;
            }
            else {
                consecutiveHead = 0;
            }
        }
        return c.numFlips();
    }

    public static void main(String[] args) {
        GVCoin c = new GVCoin(15);   // Create a GVCoin object with seed value 15
        int numHeads = 5; // Desire 5 consecutive heads
        int flips = consecutiveHeads(c, numHeads); // Should return 21 using GVCoin object with seed value 15
        System.out.println("Total number of flips for 5 consecutive heads: " + flips);
    }
}