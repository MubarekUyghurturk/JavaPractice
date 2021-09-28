package replitTasks.loops_4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long sum = 1;
        for (int i = n ; i >0; i--) {
            sum *= i;
        }

        System.out.println(sum);
    }
}
