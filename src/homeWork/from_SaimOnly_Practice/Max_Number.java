package homeWork.from_SaimOnly_Practice;

import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        String result = "";
        int max=0;

        if (num1>max){
            max=num1;
            result ="Max number is " + max;
        }

        if (num2>max){
            max=num2;
            result ="Max number is " + max;
        }

        if (num3>max){
            max=num3;
            result ="Max number is " + max;
        }

        if (num4>max){
            max=num4;
            result ="Max number is " + max;
        }

        if (num5>max){
            max=num5;
            result ="Max number is " + max;
        }

        System.out.println(result);


    }
}
