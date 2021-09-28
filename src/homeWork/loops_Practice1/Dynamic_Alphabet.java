package homeWork.loops_Practice1;

import java.util.Scanner;

public class Dynamic_Alphabet {
    public static void main(String[] args) {
        /*[Dynamic alphabet]•
        Write a program that will ask ‘upper’ or ‘lower’
        •If it is upper:print the alphabet in all uppercase letter from A to Z
        •If it is lower: print the alphabet in all uppercase letter from a to z

        -Challenge: Also ask if they want to show the alphabet in ascending or  order descending
                      -Ascending: A –Z or a –z
                      -Descending: Z –A or z –a */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        if (str.equals("upper")) {
            System.out.println("Do you wanna print ascending or descending?");
            String ascenOrDescen = scan.nextLine().toLowerCase();
            if (ascenOrDescen.equals("ascending")) {
                for (int i = 'A'; i <= 'Z'; i++) {
                    System.out.print((char) i + " ");
                }
            }
            if (ascenOrDescen.equals("descending")){
                for (int i = 'Z'; i >='A'; i--) {
                    System.out.print((char)i + " ");
                }
            }
        }



        if (str.equals("lower")) {
            System.out.println("Do you wanna print ascending or descending?");
            String ascenOrDescen = scan.nextLine().toLowerCase();
            if (ascenOrDescen.equals("ascending")) {
                for (int i = 'a'; i <= 'z'; i++) {
                    System.out.print((char) i + " ");
                }
            }
            if (ascenOrDescen.equals("descending")){
                for (int i = 'z'; i >='a'; i--) {
                    System.out.print((char)i + " ");
                }
            }
        }









    }
}
