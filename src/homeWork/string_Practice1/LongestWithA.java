package homeWork.string_Practice1;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 string: ");
        System.out.println("first string is ");
        String str1 = scan.next();

        System.out.println("Second string is ");
        String str2 = scan.next();

        System.out.println("Third string is ");
        String str3 = scan.next();


        String biggest ="";

        if (str1.contains("a") && str1.length()>biggest.length()){
            biggest = str1;
        }
        if (str2.contains("a") && str2.length()>biggest.length()){
            biggest = str2;
        }
        if (str3.contains("a") && str2.length()>biggest.length()){
            biggest = str3;
        }
        System.out.println("Longgest word with \'a\' is: " + biggest);
        System.out.println(biggest.isEmpty()? "None are valid" : "biggest" + biggest);







    }
}
