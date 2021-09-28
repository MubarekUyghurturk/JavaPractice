package Canvas_HomeWork.loops_Practice2;

import java.util.Scanner;

public class Upper_Lower_Number {
    public static void main(String[] args) {
         /*Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input:
        2juMp41EEkd4s4
        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String str= scan.nextLine();

        int lower =0;
        int upper = 0;
        int numbers =0;
        for (int i=0; i<str.length();i++){

            if ((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                upper++;
            }
            else if ((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122){
                lower++;
            }
            else if ((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57){
                numbers++;
            }
        }
        System.out.println(upper + " is upper case");
        System.out.println(lower + " is lower case");
        System.out.println(numbers + " is lower case");

        //TODO==>  Count the upper, lower and numbers in the given senrtence

        System.out.println();
        int upper2=0;
        int lower2=0;
        int numbers2=0;
        for (int j=0; j<str.length();j++){

            char eachChar = str.charAt(j);
            if (eachChar >= 'A' && eachChar<='Z'){
                upper2++;
            }
            else if (eachChar >= 'a' && eachChar<='z'){
                lower2++;
            }
            else if (eachChar >= '0' && eachChar<='9'){
                numbers2++;
            }
        }
        System.out.println("In this sentence, there are ===> " + upper2 + " is upper case");
        System.out.println("In this sentence, there are ===> " + + lower2 + " is lower case");
        System.out.println("In this sentence, there are ===> " + + numbers2 + " is lower case");








    }
}
