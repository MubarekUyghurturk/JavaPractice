package homeWork.from_SaimOnly_Practice.array;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
        int a = scan.nextInt();
        checkArrayContainsNumber(nums,a);

    }
    public static void checkArrayContainsNumber(int[] nums , int a){
        String result = "";
        for (int num  : nums){
            if (num == a){
                result ="true";
            }
            else {
                result = "false";
            }
        }
        System.out.println(result);
    }
}
