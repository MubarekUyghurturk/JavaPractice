package replitTasks.loops_4;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String guestList ="";


        while (true) {
            System.out.println("Please enter guest name:");
            String name = input.nextLine();
            guestList += name + ", ";

            System.out.println("Do you want to enter new guest name:");
            String yesNo = input.nextLine();
            if (yesNo.equals("yes")){
                name +=name;
            }else if (yesNo.equals("no")){
                guestList = guestList.substring(0,guestList.length()-2);
                System.out.println("Guest's list: " + guestList);
                System.exit(0);
            }


        }



    }
}
