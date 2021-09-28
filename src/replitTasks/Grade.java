package replitTasks;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        String name1,name2,name3,name4,name5;
        double score1,score2,score3,score4,score5,averageScore;

        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        name1 = scn.next();
        score1 = scn.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        name2 = scn.next();
        score2 = scn.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        name3 = scn.next();
        score3 = scn.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        name4 = scn.next();
        score4 = scn.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        name5 = scn.next();
        score5 = scn.nextDouble();

        averageScore = (score1 + score2 + score3 + score4 + score5)/5;


        System.out.println("Summary: " + name1 +" - " + score1 + ", " + name2 + " - " + score2 + ", "+ name3 +" - " + score3 + ", " + name4 + " - " + score4 + ", " + name5 +" - " + score5);
        System.out.println("Your average score is: " + averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
        System.out.println("```");







    }
}
