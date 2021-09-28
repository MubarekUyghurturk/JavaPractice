package Canvas_HomeWork.from_SaimOnly_Practice;

import java.util.Scanner;

public class Min_number {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int num4 = scn.nextInt();
        int num5 = scn.nextInt();

        String result = "";
        int min=0;

        if (num1<min){
            min=num1;
            System.out.println("Minimum number is: " +  min);
        }

        if (num2<min){
            min=num2;
            System.out.println("Minimum number is: " +  min);
        }

        if (num3<min){
            min=num3;
            System.out.println("Minimum number is: " +  min);
        }

        if (num4<min){
           min=num4;
            System.out.println("Minimum number is: " +  min);
        }

        if (num5<min){
            min=num5;
            System.out.println("Minimum number is: " +  min);
        }



    }
}
