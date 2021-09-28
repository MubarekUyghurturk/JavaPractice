package homeWork.mid_unit2_recap;

import java.util.Scanner;

public class Create_ID {
    public static void main(String[] args) {
        /*Create ID [String]
        Given a first name and last name create and return an id using the following format:
        the first letter of the first name as lowercase,
        the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
        the length of the first String multiplied by 2
        first name: john
        last name: smith
        id: jSmi8
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        /*System.out.println(firstName.substring(0, 1).toLowerCase());//first letter of first name
        System.out.println(lastName.substring(0,1).toUpperCase()  + lastName.substring(1,3));//
        System.out.println(firstName.length()*2);*/

        System.out.println("first name: " + firstName +"\nlast name: " + lastName + "\n\nid: " + (firstName.substring(0, 1).toLowerCase()+lastName.substring(0,1).toUpperCase()  + lastName.substring(1,3)+firstName.length()*2));


    }
}
