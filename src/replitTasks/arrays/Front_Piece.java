package replitTasks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Front_Piece {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }


        String numbers ="";
        if (size>3){
            numbers = "" + num[0] +", "+ num[1];
            String[] numbers1 = numbers.split(", ");
            System.out.println(Arrays.toString(numbers1));
        }else if (size<=2){
            System.out.println(Arrays.toString(num));
        }



    }
}
