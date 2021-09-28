package replitTasks.statements_2;

import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        int quarters, dimes, nickels, pennies;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scn.nextInt();

        if( 0 < cents && cents< 100){

            quarters = cents/25;
            dimes = (cents%25)/10;
            nickels = ((cents%25)%10)/5;
            pennies = ((cents%25)%10)%5;

            System.out.println("Your change is "+ quarters +" quarters, "+ dimes + " dimes, " + nickels +" nickels, and " + pennies + " pennies" );

        }
        else{
            System.out.println("Invalid cents amount");
        }

    }
}




