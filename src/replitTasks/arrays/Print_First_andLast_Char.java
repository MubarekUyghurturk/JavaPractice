package replitTasks.arrays;

import java.util.Scanner;

public class Print_First_andLast_Char {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String firstAndLast = "";
        for (int i = 0; i <words.length; i++) {
             firstAndLast += "\n" + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(firstAndLast);
    }
}
