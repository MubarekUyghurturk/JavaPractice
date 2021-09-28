package replitTasks.ArrayList;

import java.util.Scanner;

public class Time_Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s){

        if (s.equals("12:00:00AM")){
            System.out.println("00:00:00");
        }else {
            if (s.contains("AM")){
                System.out.println(s.substring(0,s.indexOf("A")));
            }
        }
        if (s.contains("12:00:00PM")){
            System.out.println("12:00:00");
        }else {
            if (s.contains("PM")){ // 07:05:45PM
                String afternoonTime ="";
                String hours = s.substring(0,s.indexOf(":"));
                int hour = Integer.parseInt(hours) ;

                afternoonTime ="" + (hour +12);
                System.out.println(afternoonTime + s.substring(s.indexOf(":"),s.indexOf("P") )       );
            }
        }


    }
}
