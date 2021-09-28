package homeWork.loops_Practice3;

import java.util.Scanner;

public class Prime_in_Range {
    public static void main(String[] args) {
        /*[IQ] Prime in range
        Given a number. Print out all the prime numbers from 2 to that numberA prime number is a number that is only divisible by 1 and itself.
        Ex:
        Input:50
        Output:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
        */

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 2; i <= number; i++) {
            boolean isPrime =true;

            for (int j = 2; j <i ; j++) {
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("----------------- second way to find prime number ---------------------");
        System.out.println();


        for (int i = 2; i <=number; i++) {
            int count=0;
            for (int j =2; j < i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.print(i + " ");
            }
        }


    }
}
