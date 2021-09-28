package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class Character_Checker {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);


        if(ch > 'A' && ch <'Z'){
            System.out.println( ch +" is uppercase");
        }
        else if (ch >'a' && ch <'z'){
            System.out.println(ch + " is lowercase");
        }


    }
}
