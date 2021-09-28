package homeWork.array_Practice_II;

import java.util.Arrays;
import java.util.Scanner;

public class Revers_Array {
    public static void main(String[] args) {
        /*
        * Reverse Array
        * Given an int array reverse the elements’ order
        * Ex:
        * Input: { 1, 2, 3, 4 }
        * Output: { 4, 3, 2, 1 }
        *
        * Challenge:
        * Reverse the elements without making a new array
        * */

        /*int[] numbers ={1,2,3,4};
        for (int i =numbers.length-1; i >=0 ;i--) {
            System.out.print(numbers[i] + " ");
        }*/


       // Scanner scan = new Scanner(System.in);
       // System.out.println("How many elements you want in your array?");
       // int[] numbers = new int[scan.nextInt()];




        int[] numbers = {1,2,3,4,5,6};

        for (int i = 0; i < numbers.length/2 ; i++) {
            int ElementInReverseIndex = numbers[numbers.length-1-i]; //6   5   4
            int ElementInForwardIndex = numbers[i];//1  2   3
            numbers[i] = ElementInReverseIndex;
            numbers[numbers.length-1-i] = ElementInForwardIndex;
        }
        System.out.println(Arrays.toString(numbers));




















        /*for (int i = 0; i <numbers.length; i++) {
            System.out.println("Enter your number " + (i+1) + " elements to the array");
            numbers[i] = scan.nextInt();
        }
        System.out.println("Our int array is: " + Arrays.toString(numbers));
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");
        }*/



    }
}
