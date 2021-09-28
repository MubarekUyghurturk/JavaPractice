package replitTasks.method;

import java.util.Scanner;

public class BiggerString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }



    public static String bigger(String a ,String b){

        int countA =0;
        int countB =0;
        String result = "";
        for (int i = 0; i <a.length(); i++) {
            countA++;
        }
        for (int i = 0; i <b.length(); i++) {
            countB++;
        }

        if (countA > countB){
            result = a;
        }
        else if (countB > countA){
            result = b;
        }

        return result;
    }



}
