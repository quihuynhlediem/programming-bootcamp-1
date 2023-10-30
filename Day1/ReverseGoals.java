package Day1;

import java.util.Scanner;

public class ReverseGoals {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the first goal and press the enter key.");
        String goal1 = scnr.nextLine();
        System.out.println("Please enter the second goal and press the enter key.");
        String goal2 = scnr.nextLine();
        System.out.println("Please enter the third goal and press the enter key.");
        String goal3 = scnr.nextLine();

        String result = "3. " + goal3 + "\n" + "2. " + goal2 + "\n" + "1. " + goal1;

        System.out.print(result);

        scnr.close();
    }
}
/*
Input: 3 goals, written in separate lines, one or more words
Logic: prepend each goal with a number
Output:
1/ Prompt -> input
2/ Print in reverse order
*/
