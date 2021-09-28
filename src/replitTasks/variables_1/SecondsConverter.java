package replitTasks.variables_1;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        int inputSeconds, hours, minutes, seconds;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter seconds:");
        inputSeconds = scn.nextInt();
        hours = inputSeconds / 3600;
        minutes = (inputSeconds%3600) / 60;
        seconds = (inputSeconds % 3600) % 60;








        System.out.println(hours+"hours, " + minutes +"minutes, " + seconds +"seconds");







    }
}
