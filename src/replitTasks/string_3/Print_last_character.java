package replitTasks.string_3;

import java.util.Scanner;

public class Print_last_character {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(word.length()-1));
    }
}
