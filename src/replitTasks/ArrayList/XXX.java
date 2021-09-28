package replitTasks.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class XXX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.contains("PM")){ // 07:05:45PM
            String afternoonTime ="";
            String hours = s.substring(0,s.indexOf(":"));
            int hour = Integer.parseInt(hours) ;

            afternoonTime ="" + (hour +12);
            System.out.println(afternoonTime);
            System.out.println(afternoonTime + s.substring(s.indexOf(":"),s.indexOf("P") ) +"PM"        );
        }
        else if (s.equals("12:00:00AM")){
            System.out.println("00:00:00");
        }
        else {
            System.out.println(s);
        }
    }
}
