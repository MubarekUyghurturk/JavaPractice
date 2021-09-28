package replitTasks.method;

import java.util.Scanner;

public class At3rdChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }

    public static String at3(String target,String word){

        String a = target.substring(0,3);
        String b = target.substring(3);
        String newTarget = a+ " "+b;

        String[] targetArr = newTarget.split("");
        String newString = "";
        for (int i = 0; i <targetArr.length; i++) {
            if (i == 3){
                targetArr[i] = word;
            }
            newString += targetArr[i];
        }

        return newString;
    }
}
