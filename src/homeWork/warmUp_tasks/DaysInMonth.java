package homeWork.warmUp_tasks;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner scn =new Scanner(System.in);
        System.out.println("Enter your month number");
        int month = scn.nextInt();

        if (month >=1 && month <=12){
            if (month==2){
                System.out.println("28");
            }
            else if (month == 4 || month==6 || month==9 || month==11){
                System.out.println("30 days");
            }
            else {
                System.out.println("31 days");
            }
        }
        else {
            System.out.println("Invalid month number. Can only be from 1-12");
        }







        /*System.out.println("Enter your days in the month");
        int days = scn.nextInt();

        if (days ==30){
            System.out.println("4, 6, 9, 11");
        }
        else if (days ==28){
            System.out.println("2");
        }
        else if (days == 31){
            System.out.println("1,3,5,7,8,10,12");
        }
        else {
            System.out.println("Invalid days");
        }
*/








    }
}
