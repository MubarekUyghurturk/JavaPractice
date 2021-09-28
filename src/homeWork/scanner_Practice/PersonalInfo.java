package homeWork.scanner_Practice;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age ");
        byte age = scn.nextByte();

        System.out.println("Enter your favorite number ");
        long number = scn.nextLong();

        System.out.println("Are you student? ==>  true or false");

        //boolean isStudent = age<26 && age>=6;
        boolean isStudent = scn.nextBoolean();


        System.out.println("Your age is: " + age);
        System.out.println("Your favorite number is: " + number);
        System.out.println("You are student: "+ isStudent);



    }
}
