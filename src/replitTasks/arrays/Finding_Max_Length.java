package replitTasks.arrays;

import java.util.Scanner;

public class Finding_Max_Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        String max = words[0];
        for (String word : words){
            if (word.length() > max.length()){
                max = word;
            }
        }
        System.out.println(max);





    }
}
