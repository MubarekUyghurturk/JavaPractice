package replitTasks.string_3;

import java.util.Scanner;

public class Verify_contains {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        System.out.println(sentence.contains(word));
    }
}
