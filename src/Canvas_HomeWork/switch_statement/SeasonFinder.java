package Canvas_HomeWork.switch_statement;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int monthNumber = scn.nextInt();

        switch (monthNumber){

            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;

            default:
                System.out.println("Invalid month number!");
                break;


        }




    }
}
