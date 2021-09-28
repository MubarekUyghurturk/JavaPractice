package replitTasks.loops_4;

import java.util.Locale;
import java.util.Scanner;

public class Shopping_List2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        while (count<=10){

        System.out.println("Enter Item" + count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();
        shoppingListReport += "Item"+count +": " + item + " Price: " + price + ", " ;



        totalPrice += price;

        System.out.println("Add one more item?");
        countinue = scan.next();
        if (countinue.equals("yes")){
            count++;
        }else if(countinue.equals("no")) {

            System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2) + "\nTotal price: " + totalPrice);
            System.exit(0);
        }
    }


}
}
