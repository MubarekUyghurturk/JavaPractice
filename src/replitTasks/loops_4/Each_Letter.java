package replitTasks.loops_4;

import java.util.Scanner;

public class Each_Letter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }





    }
}
