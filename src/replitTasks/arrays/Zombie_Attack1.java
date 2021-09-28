package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie_Attack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int day = 0;
        int[] inhabit = new int[inhabitants.length];
        int j = 0;
        String result = "";
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        for (int i = 0; i < inhabitants.length; i++) {


            do {
                inhabitants[i] -= inhabitants[i] * 0.5;
                inhabit[i] = inhabitants[i];
            }
            while (inhabitants[0] == 0);
            System.out.println("Day " + ++day + " " + Arrays.toString(inhabit));


        }



            /*if (inhabitants[i] > 0){
                inhabitants[i] -= inhabitants[i] * 0.5;
            }
            inhabit[j++] = inhabitants[i];

        }
        System.out.println(result);*/


    }
}
