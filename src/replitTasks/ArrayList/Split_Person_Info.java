package replitTasks.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Split_Person_Info {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String[] newInfo = info.split(",");
        System.out.println("person name: " + newInfo[0]);
        System.out.println("last name: " + newInfo[1]);
        System.out.println("age: " + newInfo[2]);




    }

}
