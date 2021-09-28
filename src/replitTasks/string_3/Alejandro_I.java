package replitTasks.string_3;

import java.util.Locale;
import java.util.Scanner;

public class Alejandro_I {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine().toLowerCase();

        if (a.contains("alejandro")){
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }
    }
}
