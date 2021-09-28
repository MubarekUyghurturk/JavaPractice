package Canvas_HomeWork.from_SaimOnly_Practice.array;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(), };
        sumOfIntArr(nums);
    }

    public static void sumOfIntArr(int[] nums){
        int sum =0;
        for (int num : nums){
            sum += num;
        }
        System.out.print("Sum of the int array is: " + sum);
    }
}

