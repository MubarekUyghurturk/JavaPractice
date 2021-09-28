package replitTasks.statements_2;

import java.util.Scanner;

public class BlackJack_keep_hand {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        String message = "";
        if ((house+player) <21 && house>=10 && player>=10 ){

            message = "player bust";
        }
        else if (house > player){
            message ="player loss";
        }
        else if (house == player){
            message ="its a tie";
        }
        else if (house < player){
            message ="player win";

        }

        System.out.println(message);



    }
}
