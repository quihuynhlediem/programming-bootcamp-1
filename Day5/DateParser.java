package Day5;

import java.util.Scanner;

public class DateParser {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String date = scnr.nextLine();
        while (!date.equals("-1")){
            //Check format
            if (date.indexOf(",") >= 0) {
                int commaIndex = date.indexOf(",");
                String month = date.substring(0, date.indexOf(" "));
                String day = date.substring(date.indexOf(" ") + 1, commaIndex);
                String year = date.substring(commaIndex + 2);
                int monthNum = getMonthAsInt(month);
                if (monthNum > 0) {
                    System.out.println(monthNum + "-" + day + "-" + year);
                }
            }
            date = scnr.nextLine();
        }
    }
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }
}

// March 1, 1990
// 15/11/2023
// March 12 1990

// month = 15/11/2023
// day =
// year =
