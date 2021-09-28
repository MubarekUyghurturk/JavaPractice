package replitTasks.arrays;

import java.util.Scanner;

public class Count_Evens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count = 0;
        for (int num : nums){
            if (num%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
