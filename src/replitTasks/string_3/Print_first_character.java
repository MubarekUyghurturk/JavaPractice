package replitTasks.string_3;

import java.util.Scanner;

public class Print_first_character {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(word.charAt(0));
    }
}
