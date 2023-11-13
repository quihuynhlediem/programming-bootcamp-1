package Demo;

import java.util.Scanner;

public class Main {
    public static void swapValues (int []values) {
        boolean check = true;
        //int []tempVals = new int[4];
        int temp;
        if (check) {
            for (int i = 0; i < values.length; i = i + 2) {
                temp = values[i];
                values[i] = values[i+1];
                values[i+1] = temp;
            }
            //values = tempVals;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int []valueList = new int[4];
        for (int i = 0; i < 4; i++) {
            int num = scnr.nextInt();
            valueList[i] = num;
        }
        swapValues(valueList);

        for (int i = 0; i < valueList.length; i++) {
            if (i < valueList.length - 1) {
                System.out.print(valueList[i] + " ");
            }
            else {
                System.out.print(valueList[i]);
            }
            System.out.println();
        }
    }
}

