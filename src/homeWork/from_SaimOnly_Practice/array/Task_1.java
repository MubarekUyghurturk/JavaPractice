package homeWork.from_SaimOnly_Practice.array;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        checkNumbersAreEqual(a,b,c);
    }

    public static void checkNumbersAreEqual(int a, int b, int c){
        if (a == b && a == c && b == c){
            System.out.println("Three numbers are equal");
        }
        else {
            System.out.println("These are not equal numbers!!!");
        }
    }



}
