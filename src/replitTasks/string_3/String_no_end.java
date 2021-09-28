package replitTasks.string_3;

import java.util.Scanner;

public class String_no_end {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        System.out.println(txt.substring(0, txt.length() - 1));
    }
}
