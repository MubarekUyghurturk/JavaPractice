package Canvas_HomeWork.string_Practice2;

import java.util.Scanner;

public class Middle_char {
    public static void main(String[] args) {

        /*
        * Given a String, write a program to display the middle character of a string
        * a) If the length of the string is even there will be two middle characters.
        * b) If the length of the string is odd there will be one middle character.
        * Ex:
        * Input: elephant
        * Output: The middle characters: ph */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str = scan.next();

        int position;
        if (str.length()%2==0){
            position = str.length()/2+1;
            int position2 = str.length()/2-1;
            System.out.println(str.substring(position2,position));
        }

        if (str.length()%2!=0){
            position = str.length()/2;
            System.out.println(str.charAt(position));
        }












        /*int position1,position2;

        if (str.length()%2==0){
            position1 = str.length()/2-1;
            position2 =2;
            message = "The middle character is: " +  str.substring(position1, position1 + position2);
        }
        if (str.length()%2!=0){
            position1 = str.length()/2;
            position2 =1;
            message = "The middle character is: " +  str.substring(position1, position1 + position2);
        }
        System.out.println(message);*/
    }
}
