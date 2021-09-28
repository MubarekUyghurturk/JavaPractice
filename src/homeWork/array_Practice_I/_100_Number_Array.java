package homeWork.array_Practice_I;

import java.util.Arrays;
import java.util.Scanner;

public class _100_Number_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers =new int[100];

        for (int i = 0; i <numbers.length; i++) {
            System.out.println("Enter your "+ (i+1)+"st number");
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString( numbers));
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
