package ExtraDay6;

import java.util.*;
import java.io.*;
public class CreditCardDebt {

    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int size;

        // Input # of customers and create parallel arrays
        size = scnr.nextInt();
        String [] names = new String[size];
        double [] debt = new double[size];
        String [] states = new String[size];

        // Fill arrays with data from external file (described in another section)
        readCustomerData(names, states, debt);

        // Step 1:
        int debtLimit = scnr.nextInt();
        String searchKey = scnr.next();
        String stateAbbr = scnr.next();
        System.out.println("U.S. Report");
        System.out.println("Customers: " + size);

        //Step 2:
        double maxDebt = debt[0];
        String maxDebtOwnerName = "";
        for (int i = 0; i < size; ++i){
            if (maxDebt < debt[i]){
                maxDebt = debt[i];
                maxDebtOwnerName = names[i];
            }
        }
        System.out.println("Highest debt: " + maxDebtOwnerName);

        //Step 3:
        int nameCount = 0;
        for (int i = 0; i < size; ++i){
            if (names[i].indexOf(searchKey) == 0){
                ++nameCount;
            }
        }
        System.out.printf("Customer names that start with \"%s\": %d\n", searchKey, nameCount);

        //Step 4:
        int overDebtCount = 0;
        int deptFreeCount = 0;
        for (int i = 0; i < size; ++i){
            if (debt[i] > debtLimit){
                ++overDebtCount;
            }
            if (debt[i] == 0){
                ++deptFreeCount;
            }
        }
        System.out.printf("Customers with debt over $%d: %d\n", debtLimit, overDebtCount);
        System.out.printf("Customers debt free: %d\n\n", deptFreeCount);


        //Step 5:
        String[] newNames = new String[size];
        double[] newDebt = new double[size];
        int peopleStateCount = 0;
        for (int i = 0; i < size; ++i) {
            if (states[i].equals(stateAbbr)) {
                newNames[peopleStateCount] = names[i];
                newDebt[peopleStateCount] = debt[i];
                ++peopleStateCount;
            }
        }
        System.out.printf("%s Report\n", stateAbbr);
        System.out.println("Customers: " + peopleStateCount);

        maxDebt = newDebt[0];
        for (int j = 0; j < peopleStateCount; ++j){
            if (maxDebt < newDebt[j]){
                maxDebt = newDebt[j];
                maxDebtOwnerName = newNames[j];
            }
        }
        System.out.println("Highest debt: " + maxDebtOwnerName);

        //Step 5-3:
        nameCount = 0;
        for (int j = 0; j < peopleStateCount; ++j){
            if (newNames[j].indexOf(searchKey) == 0){
                ++nameCount;
            }
        }
        System.out.printf("Customer names that start with \"%s\": %d\n", searchKey, nameCount);

        //Step 5-4:
        overDebtCount = 0;
        deptFreeCount = 0;
        for (int i = 0; i < peopleStateCount; ++i){
            if (newDebt[i] > debtLimit){
                ++overDebtCount;
            }
            if (newDebt[i] == 0){
                ++deptFreeCount;
            }
        }
        System.out.printf("Customers with debt over $%d: %d\n", debtLimit, overDebtCount);
        System.out.printf("Customers debt free: %d\n", deptFreeCount);
    }

    // Read customer information from text file
    // Make no changes to the following code
    public static void readCustomerData(String [] names, String [] states, double [] debt) {

        // Read all data from file
        try {
            File f = new File("CustomerNames.csv");
            Scanner scnr = new Scanner(f);
            scnr.useDelimiter("[, \r\n]+");

            for (int index = 0; index < names.length; ++index) {
                names[index] = scnr.next(); // last name
                states[index] = scnr.next(); // state of residence
                debt[index] = scnr.nextDouble(); // amount of debt
            }
            scnr.close();
        }

        // What if data file not found?
        catch(IOException e) {
            System.out.println("Failed to read the data file: ");
        }
    }
}
