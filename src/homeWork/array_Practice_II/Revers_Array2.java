package homeWork.array_Practice_II;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Revers_Array2 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[] reversed = new int[4];

         int j =0;
        for (int i = nums.length-1; i >=0 ; i--) {
            reversed[j++] = nums[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(reversed));


    }
}
