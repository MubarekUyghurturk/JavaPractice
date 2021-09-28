package replitTasks.loops_4;

import java.util.Scanner;

public class Equals_Java_Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

      int countJava =0;
      int countPython =0;

      while (true){
          if (sentence.indexOf("java") ==-1){
              break;
          }
          sentence = sentence.replaceFirst("java","");
          countJava++;
      }
        while (true){
            if (sentence.indexOf("python") ==-1){
                break;
            }
            sentence = sentence.replaceFirst("python","");
            countPython++;
        }

        boolean result = countJava == countPython? true:false;

        System.out.println(result);

    }
}
