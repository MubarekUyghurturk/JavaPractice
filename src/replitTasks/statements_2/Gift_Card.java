package replitTasks.statements_2;

import java.util.Scanner;

public class Gift_Card {
    public static void main(String[] args) {

       /* String Blanket,Charger,Hat,Headphones,Laptop,Pants,Pillow,Smartphone,Socks,USBcable;
        int
*/

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int price = scn.nextInt();

        if (str.equalsIgnoreCase("Blanket")  && price<=100  ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-60)+"$");
        }
        else if(str.equalsIgnoreCase("Charger") && price<=100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-25) + "$");
        }
        else if(str.equalsIgnoreCase("Hat") && price<=100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-25)+"$");
        }
        else if(str.equalsIgnoreCase("Headphones") && price<=100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-30)+"$");
        }
        else if (str.equalsIgnoreCase("Pants") && price<=100){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-50)+"$");
        }
        else if (str.equalsIgnoreCase("Pillow") && price<=100){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-40)+"$");
        }
        else if (str.equalsIgnoreCase("Smartphone") && price<=100){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-100)+"$");
        }
        else if (str.equalsIgnoreCase("Socks") && price<=100){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-5)+"$");
        }
        else if (str.equalsIgnoreCase("USBcable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100-10)+"$");
        }
        else if (str.equalsIgnoreCase("Laptop") && price<=100 ){
            System.out.println("Sorry, not enough found on your gift card!");
        }
        else {
            System.out.println("Invalid item!");
        }


    }
}
