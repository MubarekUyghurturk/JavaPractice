package replitTasks.string_3;

import java.util.Scanner;

public class Find_User {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scan.nextLine();

        if (name.equalsIgnoreCase("max payne") ||   name.equalsIgnoreCase("alan wake")){
            System.out.println("User found!");
        }
        else {
            System.out.println("User not found!\nPlease make your search case insensitive!");
        }
    }
}
