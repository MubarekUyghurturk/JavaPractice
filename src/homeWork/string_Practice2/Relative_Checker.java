package homeWork.string_Practice2;

import java.util.Scanner;

public class Relative_Checker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First people full name: ");
        String str1 = scan.nextLine();

        System.out.println("Second people full name: ");
        String str2 = scan.nextLine();

        String lastName1 =  str1.substring(str1.indexOf(" "),str1.length());
        String lastName2 =  str2.substring(str2.indexOf(" "),str2.length());

        if (lastName1.length() == lastName2.length()){
            if (lastName1.equals(lastName2)){
                System.out.println("Related");
            }else {
                System.out.println("Not Related");
            }
        }


    }
}
