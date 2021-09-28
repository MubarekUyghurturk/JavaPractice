package homeWork.loops_Practice2;

import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        /*
        * Count Words
        * Given a sentence determine how many words are in the String.
        * Ex:
        * Input: This has multiple words
        * Output:4
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String str = scan.nextLine().trim();

        int numberOfSpace = 0;
        for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == ' '){
              numberOfSpace++;
        }
        }
        System.out.println("Number of words are: " + (numberOfSpace+1));


        System.out.println();
        // TODO:  how to manually count the words from the string
        int lengthOfOldString = str.length();
        int lengthOfNewStringWithoutSpaces = str.replace(" ","").length();
        int numberOfSpaces = lengthOfOldString-lengthOfNewStringWithoutSpaces;
        int numberOfWords = lengthOfOldString - lengthOfNewStringWithoutSpaces+1;
        System.out.println("number of words in the sentences are: " + numberOfWords + "\nnumber of spaces in the sentences are: " + numberOfSpaces);







    }
}
