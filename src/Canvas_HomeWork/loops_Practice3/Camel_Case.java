package Canvas_HomeWork.loops_Practice3;

import java.util.Scanner;

public class Camel_Case {
    public static void main(String[] args) {
        /*Camel Case
        Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
        Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
        Ex:
        Input:thisHasManyWordsToFind
        Output: 6
        */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count =0;
        for (int i = 0; i <str.length()-1; i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i)<='Z' ){
                //System.out.print(str.charAt(i) + " ");
                count++;
            }
        }
        System.out.println(count+1);






    }
}
