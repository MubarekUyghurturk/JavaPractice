package homeWork.array_Practice_III;

import java.util.Arrays;

public class Reverse_Each_Word {
    public static void main(String[] args) {

        String str = "It started to snow in Chicago";
        String[] strs = str.split(" ");

        String reverseString = "";
        for (int i = 0; i < strs.length; i++) {
            String reverseWord = "";

            for (int j = strs[i].length() - 1; j >= 0; j--) {
                reverseWord += strs[i].charAt(j);
            }
            reverseString += reverseWord + " ";

            System.out.println(reverseString);

        }
    }
}