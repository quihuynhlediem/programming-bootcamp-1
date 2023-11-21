package ExtraDay2;

import java.util.Scanner;

public class PhoneNumBreakDown {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String phoneNum = scnr.nextLine();

        String areaCode = "(" + phoneNum.substring(0, 3) + ") ";
        String prefix = phoneNum.substring(3, 6);
        String lineNum = phoneNum.substring(6, 10);

        System.out.println(areaCode + prefix + "-" + lineNum);
    }
}
