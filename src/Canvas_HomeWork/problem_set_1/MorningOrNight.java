package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class MorningOrNight {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your time:");
        int times = scn.nextInt();

        String time = (times>0 && times<11)? "Morning" : "Night";

        System.out.println(time);

    }
}
