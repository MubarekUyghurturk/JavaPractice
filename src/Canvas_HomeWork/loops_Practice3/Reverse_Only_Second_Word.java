package Canvas_HomeWork.loops_Practice3;

import java.util.Scanner;

public class Reverse_Only_Second_Word {
    public static void main(String[] args) {
        /*Reverse only second wordGiven
        a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java
        I evol java
        */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String middleWord = str.substring(str.indexOf(' ')+1,str.lastIndexOf(' '));
        String revers = "";
        for (int i = middleWord.length()-1; i>=0; i--) {
            revers += middleWord.charAt(i);
        }
        //System.out.println(revers);
        System.out.println(str.replace(middleWord, revers));


    }
}
   /*My logic is: first pull out the middle word and revers that middle word.
    than use replace method to replace revers word to origin one*/