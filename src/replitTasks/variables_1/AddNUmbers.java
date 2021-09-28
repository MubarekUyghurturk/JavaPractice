package replitTasks.variables_1;

import java.util.Scanner;

public class AddNUmbers {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + sum);





    }

}
