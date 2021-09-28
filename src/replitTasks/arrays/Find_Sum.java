package replitTasks.arrays;

import java.util.Scanner;

public class Find_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum = 0;
        for (int num : nums ){
            sum += num;
        }
        System.out.println(sum);
    }
}
