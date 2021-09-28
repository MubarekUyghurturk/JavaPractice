package replitTasks.method;

import java.util.Arrays;
import java.util.Scanner;

public class CleanString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }


    public static String clean (String text , String badWord) {
        String[] textArray = text.split(" ");
        String result = "";
        for (int i = 0; i <textArray.length; i++) {
            if (textArray[i].equals(badWord)){
                continue;
            }
            result += textArray[i] + " ";
        }
        return result;

    }

}
