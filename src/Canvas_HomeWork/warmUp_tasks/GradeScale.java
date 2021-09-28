package Canvas_HomeWork.warmUp_tasks;

import java.util.Scanner;

public class GradeScale {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your percentage number");
        double number = scn.nextDouble();

        String message = "";
        if (number<100 && number>85){
            message = "A";
        }
        else if (number<84 && number>70){
            message = "B";
        }
        else if (number<69  && number>55){
            message = "C";
        }
        else if (number<54 && number>40){
            message = "D";
        }
        else {
            message = "Below 40";
        }

        System.out.println(message);




    }
}
