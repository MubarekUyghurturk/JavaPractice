package replitTasks;

import java.util.Scanner;

public class Print_the_longest_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String longest="";
        if (word1.length()> longest.length()){
            longest =word1;
        }
        if (word2.length() > longest.length()){
            longest = word2;
        }

        System.out.println(longest);
    }
}
