package replitTasks.statements_2;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number");
        int monthNum = scan.nextInt();

        String message ="";
        switch(monthNum){
            case 1:
                message ="January";
                break;

            case 2:
                message ="Feburary";
                break;

            case 3:
                message ="March";
                break;

            case 4:
                message = "April";
                break;

            case 5:
                message ="May";
                break;

            case 6:
                message ="June";
                break;

            case 7:
                message ="July";
                break;

            case 8:
                message ="August";
                break;

            case 9:
                message ="September";
                break;

            case 10:
                message ="October";
                break;

            case 11:
                message = "November";
                break;

            case 12:
                message = "December";
                break;

            default:
                message ="Invalid month number";
        }
        System.out.println(message);
    }
}
