package Canvas_HomeWork.loops_Practice2;

import java.util.Scanner;

public class Syllables_findSyllables {
    public static void main(String[] args) {
        /*Syllables
         Given a String separated by dashes calculate how many syllables the words are
         Ex:
         Input:ja-va
         Output:2
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.nextLine().toLowerCase(); // ja-va

        int countDash =0;
        for (int i=0; i<word.length();i++){

           if (word.charAt(i) == '-'){
              countDash++;
            }
        }
        System.out.println("Number of syllables are ==> " + (countDash+1));
    }
}
