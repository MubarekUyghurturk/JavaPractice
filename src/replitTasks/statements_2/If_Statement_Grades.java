package replitTasks.statements_2;

import java.util.Scanner;

public class If_Statement_Grades {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        String message = "";
        if (grade > 90){
            message ="excellent";
        }
        else if (grade>=70  && grade<90){
            message = "good";
        }
        else if (grade>=60  && grade<70){
            message = "pass";
        }
        else {
            message = "fail";
        }

        System.out.println(message);



    }
}
