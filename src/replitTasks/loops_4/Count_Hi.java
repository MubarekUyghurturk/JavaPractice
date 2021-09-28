package replitTasks.loops_4;

import java.util.Scanner;

public class Count_Hi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int countHi =0;
        str = str.replace(" ","");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("hi")){
                countHi++;
            }
        }

        System.out.println(countHi);
    }
}
