package replitTasks.string_3;

import java.util.Scanner;

public class SMS_Message {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
        /*
        Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        */
        sender = message.substring(0,message.indexOf("<")) + " " + message.substring(message.indexOf("<")+1,message.indexOf(">"));
        phoneNumber = "Phone Number: "  + message.substring(message.indexOf("[")+1,message.indexOf("]")) ;
        messageBody ="Message body: " + message.substring(message.indexOf("{")+1, message.indexOf("}")) ;

        System.out.println(sender +"\n"+phoneNumber + "\n" + messageBody);




    }
}
