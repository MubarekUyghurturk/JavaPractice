package replitTasks.statements_2;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();
        String message = "";

        if (choice == 1){
            message = "user selected 1";
        }
        else if (choice ==2){
            message = "user selected 2";
        }
        else if (choice ==3){
            message = "user selected 3";
        }
        else {
            message ="invalid option";
        }
        System.out.println(message);

    }
}
