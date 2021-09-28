package replitTasks.statements_2;

import java.util.Scanner;

public class Gift_Card2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int giftCard = 100;

        String laptop, smartphone;
        int blanket =60;
        int charger = 25;
        int hat = 25;
        int headphones = 30;
        int pants = 50;
        int pillow = 40;
        int socks =5;
        int usbCable = 10;
        int balance ;

        String item = scn.nextLine();
        if (item.equals("Blanket")){
            balance = giftCard - blanket;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("Charger")){
            balance = giftCard - charger;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("Hat")){
            balance = giftCard - hat;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("Headphone")){
            balance = giftCard - headphones;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("Pants")){
            balance = giftCard - pants;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("Pillow")){
            balance = giftCard -pillow;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("Smartphone")   ) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }
        else if (item.equals("Socks")){
            balance = giftCard - socks;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else if (item.equals("USB cable")){
            balance = giftCard -usbCable;
            System.out.println("Thank you for your purchase! ");
            System.out.println("Your current balance is: " + balance +"$");
        }
        else {
            System.out.println("Invalid item!");
        }



    }
}
