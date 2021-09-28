package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class Office_Hours_Schedule {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your day");
        String day = scan.next().toLowerCase();

        String message ="";

        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
                message = "Office hours at 5:30 -6:45 EST";
                break;

            case "thursday":
                message = "Soft Skills day";
                break;

            case "friday":
                message ="Day off";
                break;

            case "saturday":
            case "sunday":
                message ="Already a long day, no office hours.";
                break;

            default:
                message ="Invalid day given";
        }

        System.out.println(message);


    }
}
