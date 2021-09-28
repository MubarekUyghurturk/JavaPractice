package Canvas_HomeWork.from_SaimOnly_Practice;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scan.nextInt();

        int sum=1;
        while (num>0){ // 5

           // System.out.println(num + " ");
            sum = sum*num;
            num--;
        }
        System.out.println("Factor of the number will be : " + sum);

    }
}
