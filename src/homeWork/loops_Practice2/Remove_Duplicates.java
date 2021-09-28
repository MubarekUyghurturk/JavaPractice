package homeWork.loops_Practice2;

import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        /*Remove Duplicates
        Write a program that can remove duplicates from a String
        Ex:
        Input:abcabc
        Output: abc
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your duplicated string");
        String str= scan.nextLine().toLowerCase();

        String newString ="";

        for (int i=0; i<str.length();i++){
            String eachElement    ="" +  str.charAt(i);

            if (!newString.contains(eachElement)){
                newString += eachElement;
            }
        }
        System.out.println("Unduplicated part will ba: " + newString);

    }
}
