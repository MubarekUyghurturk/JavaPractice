package homeWork.loops_Practice2;

import java.util.Scanner;

public class IQ_Anagram {
    public static void main(String[] args) {
        /*[IQ]Anagram
        Given two Strings determine if they are anagram or not. Strings are anagram if they are built up of the same characters
        Ex:
        listen
        silent
        -> anagram

        Hint: look up and use replaceFirst()method
        * */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String str1 = scan.nextLine().toLowerCase();//listen
        int length1 = str1.length();

        System.out.println("Enter your second string: ");
        String str2 = scan.nextLine().toLowerCase();//silent
        int length2 = str2.length();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
        } else {

            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {
                        //   silent          (0,2)--> si            (2+1)-->lent
                        str2 = str2.substring(0, j) + str2.substring(j + 1);
                        break;
                    }
                }
            }
            if (str2.length() == 0){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }

        }
    }
}