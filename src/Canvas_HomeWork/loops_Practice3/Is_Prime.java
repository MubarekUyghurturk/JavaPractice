package Canvas_HomeWork.loops_Practice3;

import java.util.Scanner;

public class Is_Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isPrime = true;

        for (int i=2 ; i <= number; i++) { // 1
            if (number %i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
