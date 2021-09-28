package Canvas_HomeWork.switch_statement;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String month = scn.next();

        switch (month){

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;

            case "Feburary":
                System.out.println("28 days");
                break;

            default:
                System.out.println("Invalid days!");
                break;

        }






    }
}
