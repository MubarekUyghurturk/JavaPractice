package homeWork.problem_set_1;

import java.util.Scanner;

public class Grade_Level {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your grade level:");
        byte grade = scn.nextByte();
        String result ="";

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                result ="Elementary school";
                break;

            case 6:
            case 7:
            case 8:
                result ="Middle school";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                result = "High school";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                result ="College";
                break;

            case 17:
            case 18:
               result ="Grad school";
               break;

            default:
                result ="Invalid grade level given";
                break;
        }
        System.out.println(result);
    }
}
