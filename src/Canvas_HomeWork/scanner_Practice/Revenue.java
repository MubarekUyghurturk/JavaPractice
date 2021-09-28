package Canvas_HomeWork.scanner_Practice;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter product price: ");
        double price = scn.nextDouble();

        System.out.println("Enter product quantity: ");
        int quantity = scn.nextInt();

        double revenue = price*quantity;
        System.out.println("Product revenue gonna be: " + revenue);


    }
}
