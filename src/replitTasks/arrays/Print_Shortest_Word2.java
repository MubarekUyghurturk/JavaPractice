package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Shortest_Word2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

       // str = str.substring(0,str.length()-1); // delete the last ','
        String[] words = str.split(",");
        System.out.println(Arrays.toString(words));

        String shortest = words[0];
        int count =0;
        String temp = "";
        for (int i = 0; i <words.length; i++) {
           if (words[i].length()<shortest.length()){
               shortest = words[i];
               count++;
           }

        }

        System.out.println(count + " shortest words inside this String array");




    }
}
