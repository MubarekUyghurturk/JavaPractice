package Canvas_HomeWork.string_Practice1;

import java.util.Scanner;

public class Username_and_Password {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your valid credentials: ");
        System.out.println("Enter your user name:");
        String userName = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        if (password.length()>=5 && !password.contains(userName)) {
            System.out.println("Valid password");
            }
        else {
            System.out.println("Invalid password");

            if (password.length()<5){
                System.out.println("Password cannot be less than 5 characters");
            }
            if (password.contains(userName)) {

                System.out.println("Invalid password, username should not be in it");
            }
        }






        }
}
