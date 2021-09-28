package Canvas_HomeWork.loops_Practice2;

import java.util.Scanner;

public class Character_in_String {
    /*Characters in String
    Given a String print the ascii value codes for each character
    Ex:
    Input:“java”
    Output:1069711897
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next().toLowerCase();


        for (int i=0; i<word.length();i++){
            int caseToAscii = (int)word.charAt(i);
            System.out.print(caseToAscii + " ");
        }


    }
}
