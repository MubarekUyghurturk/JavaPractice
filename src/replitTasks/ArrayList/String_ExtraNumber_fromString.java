package replitTasks.ArrayList;

import java.util.Scanner;

public class String_ExtraNumber_fromString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));

    }

    public static String extractNum(String s) {
        String withoutLetter = s.replaceAll("[^0-9]","");
         return withoutLetter;

    }
}
