package replitTasks.method;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }



    public static int max(int x, int max){
        // Code here

        int maxNumber =0;
        if (x>max){
            maxNumber = x;
        }
        else if (max > x){
            maxNumber = max;
        }
        else {
            maxNumber = x;
        }


        return maxNumber;

    }



}
