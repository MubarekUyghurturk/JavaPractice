package replitTasks.variables_1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int hour,minute,second;
        String amOrPm;

        Scanner scn =new Scanner(System.in);
        hour = scn.nextInt();
        minute=scn.nextInt();
        second=scn.nextInt();
        amOrPm =scn.next();

        System.out.println(hour + ":" + minute +":"+ second+" "+ amOrPm);
    }
}
