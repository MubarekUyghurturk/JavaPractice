package replitTasks.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Switch_Elements {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.println(Arrays.toString(do_switch(arr)));
    }

    public static int[] do_switch(int[] i) {
        int[] newArr = new int[i.length];
        for (int j = 0; j <i.length; j++) {
            newArr[j] = i[j];
        }
        newArr[0] = i[i.length-1];
        newArr[newArr.length-1] = i[0];

        return newArr;
    }
}
