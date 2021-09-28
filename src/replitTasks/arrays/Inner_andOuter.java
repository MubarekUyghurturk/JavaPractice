package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inner_andOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        boolean hasIt = false;
        for (int i = 0; i <outer.length; i++) {
            for (int j = 0; j <inner.length; j++) {
                if (outer[i]==inner[j]){
                    hasIt =true;
                }
            }
        }
        System.out.println(hasIt);



    }
}
