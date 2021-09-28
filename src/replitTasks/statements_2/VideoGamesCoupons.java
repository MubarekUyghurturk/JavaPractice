package replitTasks.statements_2;

import java.util.Scanner;

public class VideoGamesCoupons {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scn.nextInt();



        if(coupons>=3 ){
            System.out.println("Number of Candies: " + coupons/10);
            System.out.println("Number of Gumballs: " + (coupons%10)/3);
        }
        else if (coupons <3){
            System.out.println("Not enough coupons");
        }



    }
}
