package Canvas_HomeWork.from_SaimOnly_Practice.array;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(), };
        multiplicationOfIntArr(nums);
    }

    public static void multiplicationOfIntArr(int[] nums){
        int result = 1 ;
       for (int num : nums){
           result *= num ;
       }
        System.out.println("Result is: " + result);
    }
}
