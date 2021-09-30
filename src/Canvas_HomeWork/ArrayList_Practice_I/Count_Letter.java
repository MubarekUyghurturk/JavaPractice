package Canvas_HomeWork.ArrayList_Practice_I;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Count_Letter {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("java","html","css","java","javascript", "selenium"));
        char character ='a';

        int count = 0;
        for (String each : wordList){
            for (int i = 0; i <each.length(); i++) {
                if (character == each.charAt(i)){
                    count++;
                }
            }
        }
        System.out.println(count);


  }
}
