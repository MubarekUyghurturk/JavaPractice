package Canvas_HomeWork.string_Practice1;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        accountNumber = scan.nextLine();

        String message ="";
        if (accountNumber.startsWith("2")){
            if (accountNumber.length()==7){
                message = "Valid 7-digit account number";
            }else {
                message ="Invalid 7-digit account number";
            }
        }else if (accountNumber.startsWith("5")){
            if (accountNumber.length()==10){
                System.out.println("Valid 10-digit account number");
            }else {
                System.out.println("Invalid 5-digit account number");
            }
        }else {
            System.out.println("Invalid account number");
        }



    }
}
