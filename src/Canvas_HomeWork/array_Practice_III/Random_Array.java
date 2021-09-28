package Canvas_HomeWork.array_Practice_III;

import java.util.Arrays;
import java.util.Scanner;

public class Random_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want in your integer array?");
        int[] numbers = new int[scan.nextInt()];

        System.out.println("What is your max number?");
       int max = scan.nextInt();
        //int max = numbers[scan.nextInt()-1];
        numbers[numbers.length-1] = max;

        for (int i = 0; i <numbers.length-1; i++) {
             System.out.println("Enter your number " +(i+1) );
                numbers[i] = scan.nextInt();
            if (numbers[i]>max){

                System.exit(0);
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
