package homeWork.string_Practice2;

import java.util.Scanner;

public class Move_first_Word {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String str = scan.nextLine();

        /*//String str = "Java is a fun language";
        System.out.println(str.substring(0,str.indexOf(" ")));
        System.out.println(str.substring(str.indexOf(" "),str.length()));
*/
        System.out.println(str.substring(str.indexOf(" "),str.length()) + " " + str.substring(0,str.indexOf(" ")));




    }
}
