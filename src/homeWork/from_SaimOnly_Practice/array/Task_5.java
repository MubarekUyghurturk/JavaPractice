package homeWork.from_SaimOnly_Practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
        int[] result = new int[2];
       countEvenAndOdd(nums,result);
    }
    public static void countEvenAndOdd(int[] nums, int[] result){
        int countEven = 0;
        int countOdd = 0;
        for (int num : nums){
            if (num%2==0){
                countEven++;
            }
            else if (num%2 != 0){
                countOdd++;
            }
        }
        result[0] = countEven;
        result[1]=countOdd;
        System.out.println(Arrays.toString(result));
    }
}
