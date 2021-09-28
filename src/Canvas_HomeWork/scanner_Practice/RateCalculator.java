package Canvas_HomeWork.scanner_Practice;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = scn.nextDouble();

        System.out.println("How many hours do you work a week? ");
        int weeklyHours = scn.nextByte();


        double hourlyRate = salary / (weeklyHours*52);
        System.out.println("Your ourly rate is:  " +hourlyRate);
    }
}
