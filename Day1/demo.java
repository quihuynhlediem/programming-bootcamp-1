package Day1;

import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
        sc.close();
    }
}
