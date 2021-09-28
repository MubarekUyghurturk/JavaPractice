package replitTasks.method;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }



    public static String countLetters(String str){
        String[] words = str.split(""); // aaabbcccc

        String result = "";
        //int count1 = 0;

        for (int i = 0; i <words.length; i++) {

                if (!result.contains(words[i])){
                    int count = i;
                    result += count + words[i];
                }


        }

        return result;



    }


}

