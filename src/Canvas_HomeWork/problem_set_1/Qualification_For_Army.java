package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class Qualification_For_Army {
    public static void main(String[] args) {

        String citizenship;
        boolean isResident, hasHighSchoolDiploma;
        int age;

        String message ="";

        Scanner scn = new Scanner(System.in);

        System.out.println("The person is Citizen of the USA");
        citizenship = scn.next();

        System.out.println("The person is USA resident");
        isResident = scn.nextBoolean();
        if (citizenship.equals("yes") || isResident) {



            System.out.println("Enter your age");
            age = scn.nextInt();
            if (age >= 18 && age <= 35) {


                System.out.println("Do you have high school diploma?");
                hasHighSchoolDiploma = scn.nextBoolean();
                if (hasHighSchoolDiploma) {
                    message = "You are qualified for the US Army";
                } else { System.out.println("You must have a high school diploma"); }



            } else { System.out.println("Your age must be between 18 to 35 years old"); }



        }else { System.out.println("You must be a U.S. citizen or a resident "); }


        System.out.println(message);


    }
}
