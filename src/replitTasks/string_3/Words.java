package replitTasks.string_3;

import java.util.Locale;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();


        if (word1.equals(word2)){
            System.out.println("word1 equals word2");
        }else {
            System.out.println("word1 does not equal word2");
        }





       /* word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.length() == word2.length()){
            String firstLetter1 = ""+ word1.charAt(0);
            String secondLetter1 = ""+ word1.charAt(1);
            String thirdLetter1 = ""+ word1.charAt(2);
            String fourthLetter1 = ""+ word1.charAt(3);

            String firstLetter2 = ""+ word2.charAt(0);
            String secondLetter2 = ""+ word2.charAt(1);
            String thirdLetter2 = ""+ word2.charAt(2);
            String fourthLetter2 = ""+ word2.charAt(3);

            if (firstLetter1.equals(firstLetter2) && secondLetter1.equals(secondLetter2) && thirdLetter1.equals(thirdLetter2) && fourthLetter1.equals(fourthLetter2)){
                System.out.println("word1 equals word2");
            }


        }else {
            System.out.println("word1 does not equal word2");
            System.out.println("word1 equals word2");
        }
*/





    }
}
