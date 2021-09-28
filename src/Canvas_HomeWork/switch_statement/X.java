package Canvas_HomeWork.switch_statement;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();

        String numberInWord = "";
        boolean wrongNumber = true;


        switch (number) {
            case 1:
                numberInWord = "One";
                break;
            case 2:
                numberInWord = "Two";
                break;
            case 3:
                numberInWord = "Three";
                break;
            case 4:
                numberInWord = "four";
                break;
            case 5:
                numberInWord = "Five";
                break;
            case 6:
                numberInWord = "Six";
                break;
            case 7:
                numberInWord = "Seven";
                break;
            case 8:
                numberInWord = "Eight";
                break;
            case 9:
                numberInWord = "Nine";
                break;
            case 10:
                numberInWord = "Ten";
                break;
            default:
                wrongNumber = false;
                System.out.println("Your number not in range 1 - 10");


        }
        if (wrongNumber == true)
            System.out.println("Your number in word: " + numberInWord);


    }
}