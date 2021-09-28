package replitTasks.statements_2;

import java.util.Scanner;

public class ApartmentLeasing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        int oneBedroom = 1100;
        int twoBedroom = 1850;
        int threeBedroom = 2550;


        if (numberOfBedrooms == 1){
            System.out.println("One Bedroom Selected\nStarting Price: " + oneBedroom);
        }
        else if (numberOfBedrooms == 2){
            System.out.println("Two Bedroom Selected\nStarting Price: " + twoBedroom);
        }
        else if (numberOfBedrooms ==3){
            System.out.println("Three Bedroom Selected\nStarting Price: " + threeBedroom);
        }
        else if (numberOfBedrooms >=4){
            System.out.println("No such Bedrooms available");
        }





    }
}
