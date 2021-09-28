package Canvas_HomeWork.switch_statement;

import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String message ="";
        boolean isValid = true;

        switch(number){
            case 1: message ="one";break;
            case 2: message ="two";break;
            case 3: message="three";break;
            case 4: message = "four";break;
            case 5: message = "fove";break;
            case 6: message ="six";break;
            case 7: message = "seven";break;
            case 8: message = "eight";break;
            case 9: message ="night";break;
            case 10: message ="teen";break;
            case 11: message = "eleven";break;

            default: System.out.println("Invalid data!");
                break;
        }
        System.out.println(number);
        System.out.println(message);

    }
}
