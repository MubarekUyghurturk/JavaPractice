package homeWork.array_Practice_III;

import java.util.Scanner;

public class Multiple_Words {
    public static void main(String[] args) {
        /*
        Given a String of words that are separate by commas. Find and print any words that have more than one word
        Example
        Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
        Output: wooden spoonstrash candish washer
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your words");
        String[] words = {scan.nextLine(), scan.nextLine(), scan.nextLine(),
                scan.nextLine(), scan.nextLine(), scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()};

        for (String word  :  words ){
            if (word.contains(" ")){
                System.out.println(word);

            }

        }

    }
}
