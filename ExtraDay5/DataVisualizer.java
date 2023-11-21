package ExtraDay5;

import java.util.Scanner;

public class DataVisualizer {
    public static int checkCommas(String inputStr){
        int commaCount = 0;
        int commaIndex = inputStr.indexOf(",");

        if (commaIndex < 0){
            return 0;
        }
        else {
            while (commaIndex > 0) {
                ++commaCount;
                commaIndex = inputStr.indexOf(",", commaIndex + 1);
            }
            return commaCount;
        }
    }

    public static boolean checkInteger(String dataVal){
        for (int i = 0; i < dataVal.length(); i++) {
            if (!Character.isDigit(dataVal.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static int StringToInt(String dataVal){
        return Integer.parseInt(dataVal);
    }

    public static void addData(String column1, String column2, String []column1Data, int []column2Data, int columnSize1, int columnSize2){
        column1Data[columnSize1] = column1;
        column2Data[columnSize2] = StringToInt(column2);
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String []column1Data = new String[100];
        int columnSize1 = 0;
        int []column2Data = new int[100];
        int columnSize2 = 0;

        // Enter title
        System.out.println("Enter a title for the data:");
        String dataTitle = scnr.nextLine();
        System.out.println("You entered: " + dataTitle);
        System.out.println();

        // Enter header
        System.out.println("Enter the column 1 header:");
        String header1 = scnr.nextLine();
        System.out.println("You entered: " + header1);
        System.out.println();
        System.out.println("Enter the column 2 header:");
        String header2 = scnr.nextLine();
        System.out.println("You entered: " + header2);
        System.out.println();

        // Enter data points
        System.out.println("Enter a data point (-1 to stop input):");
        String input = scnr.nextLine();
        while (!input.equals("-1")){
            if (checkCommas(input) == 1) {
                String name = input.substring(0, input.indexOf(","));
                int j = input.indexOf(",") + 1;
                while (input.charAt(j) == ' '){
                    j++;
                }
                String dataVal = input.substring(j);
                if (!checkInteger(dataVal)){
                    System.out.println("Error: Comma not followed by an integer.");
                }
                else {
                    addData(name, dataVal, column1Data, column2Data, columnSize1, columnSize2);
                    ++columnSize1;
                    ++columnSize2;
                    System.out.println("Data string: " + name);
                    System.out.println("Data integer: " + dataVal);
                }
            }
            else if (checkCommas(input) == 0){
                System.out.println("Error: No comma in string.");
            }
            else {
                System.out.println("Error: Too many commas in input.");
            }

            // Ask for new data
            System.out.println();
            System.out.println("Enter a data point (-1 to stop input):");
            input = scnr.nextLine();
        }

        // Output the table
        System.out.println();
        System.out.printf("%33s\n", dataTitle);
        System.out.printf("%-20s|", header1);
        System.out.printf("%23s\n", header2);
        System.out.println("--------------------------------------------");
        for (int i = 0; i < columnSize1; i++) {
            System.out.printf("%-20s|", column1Data[i]);
            System.out.printf("%23s\n", column2Data[i]);
        }
        System.out.println();

        //Data visualization
        for (int i = 0; i < columnSize1; i++) {
            System.out.printf("%20s", column1Data[i]);
            for (int j = 0; j < column2Data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}