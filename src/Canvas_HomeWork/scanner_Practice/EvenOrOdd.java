package Canvas_HomeWork.scanner_Practice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        boolean isEven = number%2 ==0;
        boolean isOdd = number%2 !=0;

        System.out.println(number +" is a even number: " + isEven);
        System.out.println(number +" is a odd number: " + isOdd);
    }
}
