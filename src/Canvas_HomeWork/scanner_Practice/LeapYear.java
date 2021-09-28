package Canvas_HomeWork.scanner_Practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scn.nextInt();
        boolean isLeapYear = year%4 == 0;

        System.out.println(year + " is a leap year: "+ isLeapYear);

    }
}
