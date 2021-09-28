package Canvas_HomeWork.problem_set_1;

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
        double hourlyRate, weeklyHour, numberOfWeeks;
        String salary="";
        Scanner scan = new Scanner(System.in);

        System.out.println("How much is your hourly rate?");
        hourlyRate = scan.nextDouble();
        if (hourlyRate>0){

            System.out.println("How many hour you work in a week?");
            weeklyHour = scan.nextDouble();
            if (weeklyHour>0 && weeklyHour <65){

                System.out.println("How many weeks you work?");
                numberOfWeeks = scan.nextDouble();
                if (numberOfWeeks>1 && numberOfWeeks<=52){
                    salary = "Your salary is: " + (hourlyRate * weeklyHour * numberOfWeeks);
                }else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }

            }else {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }

        }else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
        System.out.println(salary);

    }
}
