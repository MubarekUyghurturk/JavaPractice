package homeWork.ifStatementPractice;

import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Oxygen level");
        int oxygenLevel = scn.nextInt();
        String message ="";
        if (oxygenLevel >= 90){
            message = "Your tank is full";
        }
        else if (oxygenLevel >= 80){
            message = "Still ok";
        }
        else if (oxygenLevel >= 70){
            message = "Don't go too far";
        }
        else if (oxygenLevel >= 60){
            message = "Start to head back";
        }
        else if (oxygenLevel >= 50){
            message = "Be careful now you at " + oxygenLevel +"%";
        }


        System.out.println(message);








    }
}
