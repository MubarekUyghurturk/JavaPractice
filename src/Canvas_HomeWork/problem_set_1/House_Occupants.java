package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class House_Occupants {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String house = scn.nextLine();
        int message = 0;

        switch (house){

            case "Tree house":  message = 1;
                break;

            case "Mobile home": message = 2;
                break;

            case "Apartment":  message =4;
                break;

            case "Town house":  message = 6;
                break;

            case "Villa":   message = 8;
                break;

            case "Mansion":     message = 10;
                break;
        }

        System.out.println(message);

    }
}
