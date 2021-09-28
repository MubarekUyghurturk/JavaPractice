package homeWork.array_Practice_II;

public class Store_Inventory2 {
    public static void main(String[] args) {

        String[] items = {"Shoes","Jakets","Gloves","Airpods","Ipad","Backpack"};
        double[] prices ={89.99, 150.0, 9.99, 250.0, 439.5, 39.99};
        int[] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1)+ ". " + itemIds[i] + " | " + items[i] + " | " + prices[i]);
        }

        System.out.println();
        double expensive =0;
        int targetIndex =0;
        for (int i = 0; i <prices.length; i++) {
            if (prices[i]>expensive){
                expensive = prices[i];
                targetIndex = i;
            }
        }
        System.out.println("Name of the most expensive item is:  " + items[targetIndex] + "\nThe price of the most expensive item is: " + prices[targetIndex] + "\nThe id number of the most expensive item is: " + itemIds[targetIndex] );
        
        
        
        
    }
}
