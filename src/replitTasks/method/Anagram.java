package replitTasks.method;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String word1, String word2){

       /* word1.toLowerCase().trim();
        word2.toLowerCase().trim();*/

      boolean isAnagram1 = true;
      boolean isAnagram2 = true;

        for (int i = 0; i <word1.toLowerCase().trim().length(); i++) {
            if (!word2.toLowerCase().trim().contains(word1.toLowerCase().trim().charAt(i)+"")){
                isAnagram1 =false;
            }
        }

        for (int i = 0; i <word2.length(); i++) {
            if (!word1.toLowerCase().trim().contains("" + word2.toLowerCase().trim().charAt(i))){
                isAnagram2 = false;
            }
        }
        boolean result = isAnagram1 && isAnagram2;
        return result;
         }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
