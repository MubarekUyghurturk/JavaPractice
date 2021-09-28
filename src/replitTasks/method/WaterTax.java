package replitTasks.method;

import java.util.Scanner;

public class WaterTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }


    public static double waterTax(double units){
        double bill = 0.0;

        //your code here
        if (units<=50){
            bill = units*0.6;
        }
        else if (units>50 && units<=100){
            bill = units * 0.9;
        }else if (units>100 && units<=150){
            bill = (units * 0.9) + 50;
        }else if (units > 150){
            bill = (units * 0.9) + 100;
        }



        //end your code here

        return bill;
    }//end waterTax

}
