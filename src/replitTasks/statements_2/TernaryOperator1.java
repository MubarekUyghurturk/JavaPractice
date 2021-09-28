package replitTasks.statements_2;

import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();

        int result = (x>=5)? x:-x;
        System.out.println(result);





    }
}

