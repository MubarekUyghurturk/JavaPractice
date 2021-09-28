package replitTasks.string_3;

import java.util.Scanner;

public class Middle_one {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int position;

       if (word.length()%2!=0 && word.length()>=3){
           position = word.length()/2;
           System.out.println(word.charAt(position));
       }else if (word.length()==1){
            System.out.println(word+word+word);
        }


       if (word.length()%2==0 && word.length()>=4){
           position = word.length()/2+1;
           int position2 = word.length()/2-1;
           System.out.println(word.substring(position2,position));
       }
       else if (word.length()==2){
           System.out.println(word+word);
       }

    }
}
