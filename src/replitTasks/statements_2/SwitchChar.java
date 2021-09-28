package replitTasks.statements_2;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);

        String mesage = "";
        switch(response){
            case 'y':
                mesage = "Your request is being processed";
                break;

            case 'n':
                mesage = "Thank you anyway for your consideration";
                break;

            case 'h':
                mesage = "Sorry, no help is currently available";
                break;

            default:
                mesage ="Invalid entry, please try again!";
        }
        System.out.println(mesage);



    }

}
