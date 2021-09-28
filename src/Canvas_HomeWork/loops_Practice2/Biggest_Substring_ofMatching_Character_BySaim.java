package Canvas_HomeWork.loops_Practice2;

import java.util.Scanner;

public class Biggest_Substring_ofMatching_Character_BySaim {
    /*Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbcccccddddee
    Output: ccccc
    * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String other ="";
        String longSub = "";

        for (int i=0; i<str.length()-1;i++){

            other += str.charAt(i);

            if (str.charAt(i) != str.charAt(i+1)){
                if (other.length() > longSub.length()){
                    longSub = other;
                }
                other ="";

            }

        }
        System.out.println(longSub);

    }
}
