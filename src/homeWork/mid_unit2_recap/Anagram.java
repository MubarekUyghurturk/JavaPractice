package homeWork.mid_unit2_recap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "hi";
        String str2 = "bye";

        boolean result1 = true;
        boolean result2 = true;

        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains("" + str1.charAt(i))) {
                // str2= silent    ; str1= listen
                result1 = false;
            }
        }
        for (int j = 0; j < str2.length(); j++) {
            if (!str1.contains("" + str2.charAt(j))) {
               result2 = false;
            }
        }
       boolean finalResult =  result1 && result2;
        System.out.println("finalResult = " + finalResult);

    }
}

