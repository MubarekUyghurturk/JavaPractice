package Canvas_HomeWork.switch_statement;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();
        String outPut = "";

        switch (day){
            case 1: outPut ="Monday";
                break;
            case 2: outPut ="Tueday";
                break;
            case 3: outPut ="Wednesday";
                break;
            case 4: outPut ="Thursday";
                break;
            case 5: outPut ="Friday";
                break;
            case 6: outPut ="Saturday";
                break;
            case 7: outPut ="Sunday";
                break;

            default:
                System.out.println("Invalid day numbers");
        }
        System.out.println("You enter " + day + ",\nit is " + outPut);
    }
}
