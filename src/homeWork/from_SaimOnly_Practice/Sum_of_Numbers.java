package homeWork.from_SaimOnly_Practice;

import java.util.Scanner;

public class Sum_of_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scan.nextInt();

        int sum=0;
        while(num>0){
            System.out.println( num + " ");
            sum = sum+num;
            num--;
        }
        System.out.print("Your sum is: "  + sum);
    }
}
