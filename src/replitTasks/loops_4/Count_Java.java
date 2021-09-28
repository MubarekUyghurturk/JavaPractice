package replitTasks.loops_4;

import java.util.Scanner;

public class Count_Java {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int java =0;
        for (int i = 0; i < word.length()-3; i++) {
            if (word.substring(i,i+4).equals("java")){
                java++;
            }
        }

        System.out.println(java);
    }
}
