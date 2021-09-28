package Canvas_HomeWork.string_Practice2;

import java.util.Scanner;

public class Remove_firstAnd_last {
    public static void main(String[] args) {

        /*
        Given two words. Print the first word without its first character then print the second word without its last character.
        Input: apple banana
        Output: pple banan
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word: ");
        String str1 = scan.next();

        System.out.println("Enter your second word");
        String str2 = scan.next();

        str1 = str1.substring(1,str1.length());
        str2 = str2.substring(0,str2.length()-1);

        System.out.println(str1 + "\n" + str2);



    }
}
