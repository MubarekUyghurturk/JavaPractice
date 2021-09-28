package replitTasks.variables_1;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int areaCode = scn.nextInt();
        int localNumber = scn.nextInt();

        String phoneNUmber;

        phoneNUmber = "(" + areaCode+")" + "-" +localNumber ;

        System.out.println("Calling number "+  phoneNUmber);
    }
}
