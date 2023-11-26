package RMITAssessment1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Print the map
        System.out.println("Telephone number map");
        System.out.println("0 - No letters");
        System.out.println("1 - No letters");
        System.out.println("2 - A B C");
        System.out.println("3 - D E F");
        System.out.println("4 - G H I");
        System.out.println("5 - J K L");
        System.out.println("6 - M N O");
        System.out.println("7 - P Q R S");
        System.out.println("8 - T U V");
        System.out.println("9 - W X Y Z");
        System.out.println();

        //Enter the input
        System.out.println("Please enter your product name: ");
        String wordInput = scnr.nextLine();
        wordInput = wordInput.toUpperCase();

        // Algorithm starts
        String outputNum = "";
        for (int i = 0; i < wordInput.length(); i++) {
            switch (wordInput.charAt(i)){
                    case 'A':
                    case 'B':
                    case 'C':
                        outputNum += "2";
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        outputNum += "3";
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        outputNum += "4";
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        outputNum += "5";
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        outputNum += "6";
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        outputNum += "7";
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        outputNum += "8";
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        outputNum += "9";
                        break;
                }
            }
        /* for (char ch : wordInput.toCharArray()) {
            switch (ch) {
                case 'A':
                case 'B':
                case 'C':
                    outputNum += "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    outputNum += "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    outputNum += "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    outputNum += "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    outputNum += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    outputNum += "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    outputNum += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    outputNum += "9";
                    break;
            }
        }

         */
        System.out.printf("%s translates to the number: %s\n", wordInput, outputNum);

        // Add prefix
        if (wordInput.length() == 4){
            System.out.printf("The number available for %s is:\n", wordInput);
            System.out.println("13 " + outputNum);
        }
        else if (wordInput.length() == 6){
            String output1 = outputNum.substring(0, 3);
            String output2 = outputNum.substring(3);
            outputNum = output1 + " " + output2;
            System.out.printf("The numbers available for %s are:\n", wordInput);
            System.out.println("1300 " + outputNum);
            System.out.println("1800 " + outputNum);
        }
    }
}
