package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Shortest_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};


        String shortestString =str[0];
        for (String each : str){
            boolean isShort = each.length()<shortestString.length();
            if (isShort){
                shortestString = each;
            }
        }
        System.out.println(shortestString);

    }
}
