package replitTasks.loops_4;

import java.util.Scanner;

public class Print_Vowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();//howdyho

        String vowels ="aeiou";
        String newVowels ="";

        for (int i=0; i<word.length();i++){
            if (vowels.contains(word.substring(i,i+1))){
                newVowels += word.charAt(i);
            }
        }
        System.out.println(newVowels);

    }
}
