package replitTasks.variables_1;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice=0;

        System.out.println("Enter first item: ");
        item1 = scn.nextLine();
        price1 = scn.nextDouble();
        totalPrice += price1;


        scn.nextLine();
        System.out.println("Enter second item: ");
        item2 = scn.nextLine();
        price2 = scn.nextDouble();
        totalPrice +=price2;


        scn.nextLine();
        System.out.println("Enter third item: ");
        item3 = scn.nextLine();
        price3 = scn.nextDouble();
        totalPrice += price3;

       // totalPrice =price1 + price2 + price3;
        System.out.println("First item is: " + item1);
        System.out.println("Second item is: " + item2);
        System.out.println("Third item is: " + item3);
        System.out.println("Total price is: " + totalPrice);





    }
}
