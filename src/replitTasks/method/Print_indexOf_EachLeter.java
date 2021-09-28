package replitTasks.method;

import java.util.Arrays;
import java.util.Scanner;

public class Print_indexOf_EachLeter {
    //TODO : find each elements index. ex:aaabbccccdee ==>1a4b6c10d11e
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
