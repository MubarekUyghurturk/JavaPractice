package replitTasks.string_3;

import java.util.Locale;
import java.util.Scanner;

public class Email_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName, lastName,domain;
        firstName =email.toUpperCase().charAt(0) + email.substring(1,email.indexOf("_"));
        lastName =email.toUpperCase().charAt(email.indexOf("_")+1) + email.substring(email.indexOf("_")+2,email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("First name: " + firstName +"\nLast name: " + lastName +"\nDomain: " + domain);







    }
}
