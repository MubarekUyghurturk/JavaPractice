package replitTasks.string_3;

import java.util.Scanner;

public class Middle_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int firstIndex, lastIndex;

        if (word.length()%2!=0 && word.length()>=5){
            firstIndex = word.length()/2-1;
             lastIndex= word.length()/2+2;
            System.out.println(word.substring(firstIndex, lastIndex));

        }else {
            System.out.println("invalid");
        }
    }
}
