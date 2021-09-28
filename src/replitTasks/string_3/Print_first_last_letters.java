package replitTasks.string_3;

import java.util.Scanner;

public class Print_first_last_letters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.print(word.charAt(0) );
        System.out.println(word.charAt(word.length() - 1));
    }
}
