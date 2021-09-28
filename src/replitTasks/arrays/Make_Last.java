package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Make_Last {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] nums1 =new int[size*2]; // num1's size one time longer then the nums array

        for (int i = size-1; i >size-2; i--) { // 1 2 3 4
             nums1[size*2-1] = nums[i];
           // System.out.println(nums[i]);// will print out ==> 4

        }
      System.out.println(Arrays.toString(nums1));






    }
}
