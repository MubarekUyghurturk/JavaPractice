package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        String result = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Please select your option for arithmetic operation that you want to do \n  type + for addition\n  type - for subtraction\n  type * for multiplication\n  type / for division ");
        String operators = scan.next().toLowerCase();

        switch (operators){
            case "+":
                result = "You want to add this 2 numbers\nyour result is:  "+ (num1 + num2) ;
                break;

            case "-":
                result ="You want to subtract this 2 numbers\nyour result is:  "+ (num1 - num2);
                break;

            case "*" :
                result ="You want to multiply this 2 numbers\nyour result is:  " + (num1*num2);
                break;

            case "/":
                result ="You want to divide this 2 numbers\nyour result is:  " + (num1 / num2);
                break;

            default:
                result ="Invalid input";
        }

        System.out.println(result);

    }
}
