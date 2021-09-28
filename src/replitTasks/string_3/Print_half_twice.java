package replitTasks.string_3;

import java.util.Scanner;

public class Print_half_twice{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int position;

        if (word.length()%2 !=0 ){
            position = word.length()/2;
            System.out.println(word.substring(0, position) + word.substring(0, position) );
        }
        if (word.length()%2 == 0){
            position = word.length()/2;
            System.out.println(word.substring(0, position) + word.substring(0, position));
        }






/*
*unity              java
2                    2
i                    a   */


    }
}
