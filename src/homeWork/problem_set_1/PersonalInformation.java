package homeWork.problem_set_1;

import java.util.Scanner;
public class PersonalInformation {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("How many people you live with?");
        int people = scn.nextInt();

        if (people <2){
            System.out.println("Live with less then 2 people");
        }
        else if (people >=3 && people <= 6){
            System.out.println("Live with 3 - 6 people");
        }
        else if (people >6){
            System.out.println("Live with more than 6 people");
        }

        scn.nextLine();

        System.out.println("Which city you live in?");
        String city = scn.nextLine();


        System.out.println("Are you live in downtown?");
        String downtown = scn.next();

        if (downtown.equals("yes")){
            System.out.println("have your ever thought about moving to the suburbs?");
            String isSuburbs = scn.next();

            if (isSuburbs.equals("yes")){
                System.out.println("do it its great");
            }
            else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("What is your favorite animal?");
        String animal = scn.next();
        System.out.println("Wow " + animal +" is a great animal");

        System.out.println("How many pets you want?");
        int petsNumber = scn.nextInt();
        System.out.println("Interesting, do you want " + petsNumber + " " + animal + "?");






    }
}
