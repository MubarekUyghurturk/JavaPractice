package homeWork.ifStatementPractice;

import java.util.Scanner;

public class IfStatement_Operators {
    public static void main(String[] args) {

        /*  1)
         * Write a program that will accept a boolean value.
         *  Print out the opposite of the given boolean
         * */

        Scanner scn = new Scanner(System.in);
       /* System.out.println("Enter true or false?");
        boolean bl = scn.nextBoolean();

        if (bl == true) {
            System.out.println("Opposite of your type is: " + !bl);
        }
    }*/



    /* 2)
     * Write a program that will accept your salary amount.
     *  Then also ask the user if they are full time or not (boolean).
     *  If they are fulltime add 20000 to their salary, but if they are
     *  part time then subtract 5000. Print the final salary.
     * */

        /*System.out.println("Enter your salary:");
        int salary = scn.nextInt();

        System.out.println("Are you full time? true or false");
        boolean isFulltime = scn.nextBoolean();


        if(isFulltime){
            salary += 20000;
            System.out.println("Your salary is: " + salary);
        }else {
            salary -= 5000;
            System.out.println("Your salary is: " + salary);
        }*/


    /*  3)
     * Write Java program that will have three numbers and
     * print the greatest number.
     *
     * First number: 4
     * Second number: 8
     * Third number: 1O
     * output:The greatest number from 4, 8, 1 is:  8
     * */

       /* System.out.println("Enter 3 different numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();*/
        /*int biggest = 0;

        if (a>b && a>c){
            biggest = a;
            //System.out.println("The greatest number from " + a +", " + b +", " + c + " is: " + biggest);
        }
        if (b>a && b>c){
            biggest = b;
           // System.out.println("The greatest number from " + a +", " + b +", " + c + " is: " + biggest);
        }
        if(c>a && c>b) {
            biggest = c;
           // System.out.println("The greatest number from " + a +", " + b +", " + c + " is: " + biggest);
        }

        System.out.println("The greatest number from " + a +", " + b +", " + c + " is: " + biggest);
*/
       /* int largest = a;

        if (b>largest){
            largest = b;
        }
        if (c>largest){
            largest = c;
        }
        System.out.println("the largest number is: " + largest);
*/
    /* 4)
     * Write a Java program to implement following logic using if statement1.
     * if hour is less than 12 noon, greet with Good Morning2.
     * if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon3.
     * if hour is greater than or equal to 3 pm, greet with Good Evening
     * */

        // 24 hour format
       /* System.out.println("What time is it? ");
        int hour = scn.nextInt();

        if (hour<12 && hour>0){
            System.out.println("Good Morning!");
        }
        if (hour>=12 && hour <15){
            System.out.println("Good Afternoon!");
        }
        if (hour>=15 && hour<24){
            System.out.println("Good Evening!");
        }
*/


    /* 5)
     * Write a program that will give the grade after the retake.
     * The program should read a score of the test and which attempt it was.
     * If its the first attempt -> subtract 10%
     * If its the second attempt -> subtract 20%
     * If its the third attempt -> subtract 35%
     * */

        System.out.println("What retake attempt number is this?");
        int attempt = scn.nextInt();

        System.out.println("What is your grade " + attempt);
        double grade = scn.nextDouble();

        double finalGrade = 0;

        if (attempt == 1){
            finalGrade = grade -(grade * 0.1);
        }
        else if ( attempt ==2){
            finalGrade = grade - (grade * 0.2);
        }
        else if ( attempt ==3){
            finalGrade = grade - (grade * 0.35);
        }


        System.out.println("After attempt " + attempt + " your final grade is " + finalGrade);














    }
}
