package Canvas_HomeWork.ArrayList_Practice_I;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_Word {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("java","html","css","java","javascript", "selenium"));
        String word = "java";
        int count = 0;
        for (String each : wordList){
            if (each.equals(word)){
                count++;
            }
        }

        System.out.println(count);



    }
}
