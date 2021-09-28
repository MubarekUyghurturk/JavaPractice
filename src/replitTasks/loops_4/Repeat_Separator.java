package replitTasks.loops_4;

import java.util.Scanner;

public class Repeat_Separator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String newString ="";

        for (int i=0; i<count; i++){
            if (i<count-1){
                newString += word + separator;
            }
            else {
                newString += word;
            }
        }
        System.out.println(newString);

    }
}
