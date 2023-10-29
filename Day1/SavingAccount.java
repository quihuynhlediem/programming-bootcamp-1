package Day1;

import java.util.Scanner;

public class SavingAccount {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String name;
        double balance, interest;
        System.out.println("Please enter your first name only, the balance of your savings account, and the annual interest paid on your savings account.");

        name = userInput.next();
        balance = userInput.nextDouble();
        interest = userInput.nextDouble();

        System.out.println();
        System.out.println("Opening Balance: $" + balance);
        balance = balance + ((balance * interest) / 100);
        System.out.println("First Year: $" + balance);
        balance = balance + ((balance * interest) / 100);
        System.out.println("Second Year: $" + balance);
        balance = balance + ((balance * interest) / 100);
        System.out.printf("Third Year: $ %.2f", balance).println();

        userInput.close();

    }
}
/*
Input: 3 inputs - on single line: first name, saving amount, annual interest
2nd and 3rd inputs must allow a decimal point

Output: Annual balance of first 3 years

 */
