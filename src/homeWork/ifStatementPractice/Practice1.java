package homeWork.ifStatementPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

     // 1)
        int x = 0;
        int y = 20;
        if (y == 20){
            x = 5;
            System.out.println("X is: " + x);
        }
     // 2)
        int fees;
        boolean max = true;
        if(max){
            fees = 50;
            System.out.println("Fees is: " + fees);
        }

     // 3)
        int a = 0;
        int b = 50;
        int c = 100;
        if (b==50 && c >= 100){
            a=20;
            System.out.println("a is: " + a);
        }

     // 4)
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = scn.nextInt();
        if(temp >= 70 && temp <=80){
            System.out.println("The ideal temperature is: "+ temp);
        }













    }
}
