package replitTasks.loops_4;

import java.util.Scanner;

public class Cats_and_Dogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        while (true){

            if (word.indexOf("cat") == -1){
                break;
            }
            word = word.replaceFirst("cat","");
            countOfCats++;
        }


        while (true){

            if (word.indexOf("dog") == -1){
                break;
            }
            word = word.replaceFirst("dog","");
            countOfDogs++;
        }

        boolean result = countOfCats == countOfDogs? true:false;
        System.out.println(result);


    }
}
