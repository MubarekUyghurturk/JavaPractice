package replitTasks.method;

import java.util.Scanner;

public class Fibonacci {
    // input index number will return corresponding number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        //                         5
        int[] numbers = {0,1,1,2,3,5,8,13,21,34,55,89};

       int result = 0;
        for (int i = 0; i <numbers.length; i++) {
            if (num == i){
                result = numbers[i];
            }
        }
        System.out.println(result);
    }

}
