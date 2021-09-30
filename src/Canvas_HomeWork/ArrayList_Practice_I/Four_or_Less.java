package Canvas_HomeWork.ArrayList_Practice_I;

import java.util.ArrayList;
import java.util.Arrays;

public class Four_or_Less {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple","tree","loop","cat","animal","shortcut"));
        ArrayList<String> fourOrLess = new ArrayList<>();
        for (String each : list){
            if (each.length() <= 4){
                fourOrLess.add(each);
            }
        }
        System.out.println(fourOrLess);

    }
}
