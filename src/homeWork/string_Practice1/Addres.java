package homeWork.string_Practice1;

import java.util.Scanner;

public class Addres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please provide your address below: ");
        String address = scan.nextLine().toUpperCase();

        if (!address.isEmpty()){
            System.out.println(address);
        }else {
            System.out.println("No address found");
        }










    }
}
