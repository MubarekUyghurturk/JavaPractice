package homeWork.array_Practice_I;

import java.util.Arrays;
import java.util.Scanner;

public class Average_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers does your array include?");
        int[] numbers = new int[scan.nextInt()];

        int sum =0;
        for (int i = 0; i <numbers.length; i++) {

            System.out.println("Enter your index " + (i+1));
            numbers[i]=scan.nextInt();
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers) + "--> average is: " + sum/numbers.length);


    }
}
