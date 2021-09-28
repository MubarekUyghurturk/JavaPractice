package replitTasks.arrays;

import java.util.Scanner;

public class Printing03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6]; // 1 2 3 4 5 6
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }

        String temp = "";
        for (int i = 0; i <arr.length-4; i++) {
            temp += arr[(i*2)] + ", " + arr[(i*2)+1] + ", " + arr[(i*2)+2]  +"\n" + arr[(i*2)+1] + ", " + arr[(i*2)+2] + ", " + arr[(i*2)+3] + "\n";
         }
        System.out.println(temp.trim());
    }
}
