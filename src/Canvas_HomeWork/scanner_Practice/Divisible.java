package Canvas_HomeWork.scanner_Practice;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scn.nextInt();
        boolean isDivisibleTwo = number%2 == 0;
        boolean isDivisibleThree = number%3 == 0;
        boolean isDivisibleFive = number%5 == 0;


        System.out.println( number + " is divisible by 2:  " + isDivisibleTwo);
        System.out.println( number + " is divisible by 3:  " + isDivisibleThree);
        System.out.println( number + " is divisible by 5:  " + isDivisibleFive);

    }
}
