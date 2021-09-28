package Canvas_HomeWork.warmUp_tasks;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scn.nextInt();

        if (number%5==0 && number%3==0){
            System.out.println("FizzBuzz");
        }
        else if (number%5==0){
            System.out.println("Buzz");
        }
        else if (number%3==0){
            System.out.println("Fizz");
        }

    }
}
