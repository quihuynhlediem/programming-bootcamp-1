package Assessment1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int input = sc.nextInt();
        if (isPrime(input)){
            System.out.printf("You entered the number: %d which is a prime number.", input);
        }
        else {
            System.out.printf("You entered the number: %d which is NOT a prime number.", input);
        }
        sc.close();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
}
