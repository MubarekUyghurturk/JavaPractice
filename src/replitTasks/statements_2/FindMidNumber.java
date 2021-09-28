package replitTasks.statements_2;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter first number:");
        num1 = scn.nextInt();

        System.out.println("Enter second number:");
        num2 = scn.nextInt();

        System.out.println("Enter third number:");
        num3 = scn.nextInt();


        if(num1 > num2 && num1 < num3){
            System.out.println("Medium value is: " + num1);
        }
        else if(num2 > num1 && num2 < num3){
            System.out.println("Medium value is: " + num2);
        }
        else if(num3 > num1 && num3 < num2){
            System.out.println("Medium value is: " + num3);
        }



    }
}
