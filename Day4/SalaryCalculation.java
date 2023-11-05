package Day4;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the hourly wage: ");
        int wage = scnr.nextInt();
        System.out.println("Enter the working hours: ");
        int workingTime = scnr.nextInt();
        final int LIMIT_WORKING_TIME = 40;
        int salary = 0;
        int overTime = 0;

        if (workingTime <= LIMIT_WORKING_TIME){
            salary = workingTime * wage;
        } else {
            overTime = workingTime - LIMIT_WORKING_TIME;
            salary = (int) ((LIMIT_WORKING_TIME * wage) + ((1.5 * wage) * overTime));
        }
        System.out.print("Weekly salary is: " + salary);
    }
}
