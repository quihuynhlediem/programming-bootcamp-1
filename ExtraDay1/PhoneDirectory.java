package ExtraDay1;

import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int areaCode = scnr.nextInt();
        int prefix = scnr.nextInt();
        int lineNum = scnr.nextInt();

        //Step 1
        String usPhoneNum = "+1 " + "(" + areaCode + ")" + prefix + "-" + lineNum;

        System.out.printf("%-9s%s\n", "Country", "Phone Number");
        System.out.printf("%-9s%s\n", "-------", "------------");
        System.out.printf("%-9s%s\n", "U.S.", usPhoneNum);

        //Step 2
        String brPhoneNum = "+55 " + "(" + areaCode + ")" + (prefix + 100) + "-" + lineNum;
        System.out.printf("%-9s%s\n", "Brazil", brPhoneNum);

        //Step 3
        String crPhoneNum = "+385 " + "(" + areaCode + ")" + prefix + "-" + (lineNum + 50);
        System.out.printf("%-9s%s\n", "Croatia", crPhoneNum);
        String egPhoneNum = "+20 " + "(" + (areaCode + 30) + ")" + prefix + "-" + lineNum;
        System.out.printf("%-9s%s\n", "Egypt", egPhoneNum);

        //Step 4
        String frPhoneNum = "+33 " + "(" + prefix + ")" + areaCode + "-" + lineNum;
        System.out.printf("%-9s%s\n", "France", frPhoneNum);
    }
}
