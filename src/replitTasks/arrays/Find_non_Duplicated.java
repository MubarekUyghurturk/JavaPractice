package replitTasks.arrays;

import java.util.Scanner;

public class Find_non_Duplicated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        int unique = 0;
        for (int i = 0; i <nums.length; i++) { // 1 1 2 3 4 3 4
            int count =0;
            for (int j = 0; j <nums.length; j++) { // 1 1 2 3 4 3 4
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count == 1){
                unique = nums[i];
            }
        }
        System.out.println(unique);
    }
}
