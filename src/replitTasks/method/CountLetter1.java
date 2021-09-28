package replitTasks.method;

import java.util.Scanner;

public class CountLetter1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(); // aaabbcccc

        String[] words = str.split("");
        String duplicated  ="";
       /* for (int i = 0; i <words.length; i++) {
            if (!duplicated.contains(words[i])){
                duplicated += words[i];
            }
        }
        System.out.println(duplicated);*/


        for (int i = 0; i <words.length; i++) {
            int count = 0;
            for (int j = 0; j <words.length; j++) {
                if (words[i] == words[j]) {
                    count++;
                }
                    if (!duplicated.contains(words[i])) {
                        duplicated += words[i];
                    }
                }
            System.out.println(count + "" + duplicated);
            }

        }

    }

