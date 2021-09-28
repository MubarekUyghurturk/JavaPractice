package replitTasks.statements_2;

import java.util.Scanner;

public class BurgerOrChicken {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String in = s.next();
        double price =0;
        if (in.equals("burger") || in.equals("chicken")){
            price = 10.0;
        }
        else if (in.equals("soda")){
            price = 2.0;
        }
        else if (in.equals("fries")){
            price = 3.5;
        }
        System.out.println(price);



    }

}
