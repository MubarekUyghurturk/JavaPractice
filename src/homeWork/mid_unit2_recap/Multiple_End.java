package homeWork.mid_unit2_recap;

import java.util.Scanner;

public class Multiple_End {
    public static void main(String[] args) {
        /*
        * Multiply End [String, Loops]
        * Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
        * Ex:
        * Input:Hello?3
        * Output:Hello????
        *
        * Ex:
        * Input:java5
        * Output:javaaaaaa
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = scan.nextLine();

        System.out.println("How many time you wanna repeat the end?");
        int repeat = scan.nextInt();
        for (int i=0; i<repeat;i++){
            str += str.charAt(str.length()-1);
        }
        System.out.println(str);








    }
}
