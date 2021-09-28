package homeWork.from_SaimOnly_Practice;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scan.nextLine();
        String result = "";

        while(word.length()>0){

            if (!result.contains(word.substring(0,1))){

                result += word.substring(0,1);
                word = word.replace(word.substring(0,1),"");
            }
        }
        System.out.println(result);
    }
}
