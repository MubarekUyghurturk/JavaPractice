package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Print_First_andLast_Char2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        int j =0;
        String[] temp = new String[words.length];
        for (int i = 0; i <words.length; i++) {
            temp[j++] = " " + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(temp));


    }
}
