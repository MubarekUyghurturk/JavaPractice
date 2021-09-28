package homeWork.array_Practice_I;

import java.util.Arrays;
import java.util.Scanner;

public class Even_and_Odd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements you want your array include? ");
        int[] numbers = new int[scan.nextInt()];

        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Enter your number " + (i+1) + " element in array ");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));


        int countEven = 0;
        int countOdd = 0;
        String even ="";
        String odd ="";
        int[] evenArr = new int[numbers.length];
        int[] oddArr = new int[numbers.length];

        int j=0;
        for (int i = 0; i <numbers.length; i++) {

            if (numbers[i]%2==0){
                countEven++;
                even += numbers[i] +", ";
                evenArr[j++] = numbers[i];
            }

            if (numbers[i]%2 != 0){
                countOdd++;
                odd += numbers[i]+ ", ";
                oddArr[j++] = numbers[i];
            }
        }
        System.out.println("Even numbers are "+ even + "\nthere are " + countEven + " even numbers in the array");
        System.out.println();
        System.out.println("Odd numbers are "+ odd + "\nthere are " + countOdd + " even numbers in the array");
        System.out.println();
        System.out.println("All the even numbers int array ===> " + Arrays.toString(evenArr));
        System.out.println("All the odd numbers int array ===> " + Arrays.toString(oddArr));

       /* System.out.println();
        System.out.println(" for counting part I used for each loop ");
        int countEven1 = 0;
        int countOdd1 = 0;
        for (int num : numbers){
            if (num%2==0){
                countEven1++;
            }
            else if (num%2 !=0){
                countOdd1++;
            }
        }
        System.out.println("Even number : " + countEven1);
        System.out.println("Odd number : " + countOdd1);
        */


    }
}
