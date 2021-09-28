package homeWork.array_Practice_II;

import java.util.Arrays;

public class Store_Inventory {
    public static void main(String[] args) {
        /*
        * -Make the 3 arrays for the separate items with their information
        * -Print the arrays to see all the information
        * -Then go through and find the information of the most expensive item
        *       -Print the item name,price,and id
        * */
        String[] items = {"Shoes","Jakets","Gloves","Airpods","Ipad","Backpack"};
        double[] prices ={89.99, 150.0, 9.99, 250.0, 439.5, 39.99};
        int[] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};

        /*String result="";
        for (String item : items){
            if (item.contains("Jakets")){
                   result=item;
            }
        }
        System.out.println(result);*/

        System.out.println(Arrays.toString(items) + "\n" + Arrays.toString(prices) + "\n" + Arrays.toString(itemIds));
        System.out.println();

        double expensive = prices[0];
        int resultIndex = 0;
        for (int i = 0; i <prices.length; i++) {
            if (prices[i]>expensive){
                expensive = prices[i];
                resultIndex = i;
            }
        }
        System.out.println("Name of the most expensive item is:  " + items[resultIndex] + "\nThe price of the most expensive item is: " + prices[resultIndex] + "\nThe id number of the most expensive item is: " + itemIds[resultIndex] );
    }
}
