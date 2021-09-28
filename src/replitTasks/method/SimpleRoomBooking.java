package replitTasks.method;

import java.util.Scanner;

public class SimpleRoomBooking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }


    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here
        boolean canBeBook = false;
        if (isAvailable ){
            if (month == 7 && day>8 && year==2018){
                canBeBook = true;
            }
            else if (month != 7 && (day>=1 && day<30) && year ==2018){
                canBeBook = true;
            }
        }
        return canBeBook;



    }
}
