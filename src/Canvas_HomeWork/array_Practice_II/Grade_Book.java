package Canvas_HomeWork.array_Practice_II;

import java.util.Scanner;

public class Grade_Book {
    public static void main(String[] args) {
        /*
        * Grade book ( Started in class)
        * Declare three arrays:
        * 1.String array which will hold names for the students (give values)
        * 2.Int array which has the score of the student got in the quiz (give values)
        * 3.Char array which will have some letter grade based on the score (empty)
        * 4.Output the grade book at the end with all the information
        * Grade scale:
        * Above 85: A
        * Above 75: B
        * Above 65: C
        * Other: D
        * Challenge: Accept all the information with Scanner
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many students you wanna enter?");
        String[] students = new String[scan.nextInt()];

        System.out.println("How many scores you wanna enter?");
        int[] scores = new int[scan.nextInt()];

        char[] grades = new char[students.length];
        for (int i = 0; i <students.length; i++) {
            System.out.println("Enter your " + (i+1) +" student and the score");
            students[i] = scan.next();
            scores[i] = scan.nextInt();

            if (scores[i] >=85){
                grades[i] ='A';
            }
            else if (scores[i]>=75){
                grades[i]='B';
            }
            else if (scores[i]>=65){
                grades[i] = 'C';
            }
            else {
                grades[i] ='D';
            }
            System.out.println(students[i] +" | " + scores[i] + " | " + grades[i]);
        }


    }
}
