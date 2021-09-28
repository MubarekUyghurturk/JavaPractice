package replitTasks.arrays;

import java.util.Scanner;

public class Print02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];  // 1 2 3 4 5 6 7 8
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        String temp =" ";
        for (int i = 0; i <arr.length-4; i++) {

                temp += arr[i*2] + ", " + arr[(i*2)+1] + "\n";
                     //arr[i*2] + ", " + arr[(i*2)+1]
        }           // 0  1  2
        System.out.println(temp.trim());




    }
}
