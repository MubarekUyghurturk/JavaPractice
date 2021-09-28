package Canvas_HomeWork.string_Practice1;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word below: ");
        String str = scan.nextLine().toLowerCase();

        String message ="";

       /* if (str.contains("idiot") || str.contains("dumb") || str.contains("heck")){
            message = "Message not sent";
        }
        else {
           message ="Message sent";
        }
        System.out.println(message);*/


        boolean hasBadWord = str.contains("idiot") || str.contains("dumb") || str.contains("heck");
        if (hasBadWord){
            message = "Message not sent";
        }
        else {
            message = "Message sent";
        }

        System.out.println(message);
    }
}
