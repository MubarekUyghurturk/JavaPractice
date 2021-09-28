package replitTasks.string_3;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length()==5){ // apple

            System.out.print(word.charAt(word.length()-1));
            System.out.print(word.charAt(word.length() - 2 ));
            System.out.print(word.charAt(word.length() - 3));
            System.out.print(word.charAt(1));
            System.out.print(word.charAt(0));

        }else if (word.length()>5){
            System.out.println("Too long!");
        }else if (word.length()<5){
            System.out.println("Too short!");
        }



    }
}
