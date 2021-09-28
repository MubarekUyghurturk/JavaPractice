package homeWork.warmUp_tasks;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scn.nextInt();

        if (age <1){
            System.out.println("infant");
        }
        else if (age>3 && age<5){
            System.out.println("Toddler");
        }
        else if (age <9 && age>6){
            System.out.println("Kid");
        }
        else if (age>10 && age<12){
            System.out.println("Pre - Teen");
        }
        else if (age>13 && age<17){
            System.out.println("Teenager");
        }
        else if (age>18 && age<20){
            System.out.println("Young Adult");
        }
        else if (age>21 && age<35){
            System.out.println("Adult");
        }
        else if (age>36 && age<55){
            System.out.println("Middle - Aged Adult");
        }
        else if (age>55 && age<120){
            System.out.println("Senior Citizen");
        }
        else if (age>120 || age<0){
            System.out.println("invalid entry");
        }




    }
}
