package replitTasks.string_3;

import java.util.Scanner;

public class Email_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName,lastName,restOfThem;
        if (email.contains("_")){
            firstName = email.substring(0,email.indexOf("_"));
            lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            restOfThem = email.substring(email.indexOf("@"),email.length());
            System.out.println(lastName + "_" + firstName + restOfThem);
        }
        if (!email.contains("_")){
            System.out.println(email);
        }

    }
}
