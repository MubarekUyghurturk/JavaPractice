package Canvas_HomeWork.mid_unit2_recap;

import java.util.Scanner;

public class HTML_Generator {
    public static void main(String[] args) {
        /*HTML Generator [String, Loops]
        Given a String in the following format take the number part of the generator the html tags
        Ex:
        Input:div^2
        Output:<div></div><div></div>

        Ex:
        Input:li^3
        Output:<li></li><li></li><li></li>
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your HTML key string:");
        String str = scan.nextLine();// li^3

        String result ="";
        String tag = str.substring(0,str.indexOf("^"));
        int number = str.indexOf("^")+1;

        for (int i = 0; i < number; i++) {
            result += "<" +tag +"></"+tag+">";
        }
        System.out.println(result);

        // second solution to solve the task
        char numInChar = str.charAt(str.indexOf('^')+1);
        String tag2 = str.substring(0,str.indexOf("^"));

        String html = "";

        int num = numInChar -48; // it makes the char number value to int number value

        for (int i = 0; i < num; i++) {
            html += "<" +tag +"></"+tag+">";
        }

        System.out.println(html);











    }
}
