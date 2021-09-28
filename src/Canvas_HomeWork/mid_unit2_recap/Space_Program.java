package Canvas_HomeWork.mid_unit2_recap;

import java.util.Scanner;

public class Space_Program {
    public static void main(String[] args) {
        /*Space program [String, Loops]
        Given a String return a version of with spaces between all of the letters.If there is already a space in the String put an underscore
        Ex:
        java       -> j a v a
        space      -> s p a c e
        more words -> m o r e _ w o r d s
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = scan.nextLine();

        if (str.contains(" ")){
       str = str.replace(' ','_');

        }

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");
        }


        System.out.println();
        System.out.println();
        // Second way to solve same task
        String spaceResult = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                spaceResult += "_ ";
            }
            else {
                spaceResult += str.charAt(i) + " ";
            }
        }

        System.out.println("Translated " + str + " to: ");
        System.out.println(spaceResult.trim());

    }
}
