package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Shift_Left {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        int[] numbers = new int[size];
        numbers[nums.length-1] = nums[0];

        int j = 0;
        for (int i = 1; i <nums.length; i++) {
             numbers[j++] = nums[i];
        }
        System.out.println(Arrays.toString(numbers));

    }
}
