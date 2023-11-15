package Day8;

public class AddressTest{
    public static void main(String[] args){
        /**
         * Sample code has been provided as starting point to test your implementation.
         *
         * IMPORTANT: This code will not compile until you write the classes and enum being used here.
         * You may modify this code for faster testing purposes and exploration, but your assessment is
         * evaluated through the use of unit tests, so you need to ensure that the classes/enum you write
         * comply with the requirements set out in the documentation.
         *
         * Adding undocumented methods to your classes will mean that
         * the unit tests may fail.
         */

        // UNCOMMENT THE CODE BELOW ONCE YOU HAVE WRITTEN YOUR CODE TO TEST YOUR IMPLEMENTATION
        final Suburb CARLTON_NORTH = new Suburb("Carlton North", "Melbourne", State.VICTORIA, "3054");

        final Address ADDRESS = new Address(478, "Rathdowne Street", CARLTON_NORTH);
        System.out.println(ADDRESS);




    }
}
