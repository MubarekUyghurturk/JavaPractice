package replitTasks.method;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }


    public static String profits(int buyPrice,int sellPrice){
        //your code here

        String result = "";
        if (buyPrice > sellPrice){
            result = "loss";
        }
        else if (sellPrice > buyPrice){
            result = "profit";
        }
        else if( buyPrice == sellPrice){
            result ="no loss";
        }

        return  result;
    }
}
