package replitTasks.string_3;

import java.util.Scanner;

public class Prefix_Again {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        boolean b = n <= str.length();


        if (str.contains(str.substring(0, n)) && b) {
            System.out.println(str.substring(n).contains(str.substring(0, n)));
        } else if (!str.contains(str.substring(0, n)) && !b) {

            System.out.println(false);
        }



    }
}
