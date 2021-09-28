package replitTasks.arrays;

import javax.net.ssl.SSLEngineResult;
import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        boolean has5 =false;
        for (int i = 0; i <nums.length-1; i++) { // 1 5 5 1 1
            if (nums[i] == 5 && nums[i+1] == 5 ){
                has5 =true;
            }
        }
        System.out.println(has5);
    }
}
