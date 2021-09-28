package homeWork.mid_unit2_recap;

import java.util.Scanner;

public class Mood_Ring {
    public static void main(String[] args) {
        /*Mood Ring [Switch]
        You have a mood ring and need to know what mood you are in based on the color.
        The color will also provide a max budget value that is suggested for shopping
        data:
        pink:
        mood: happy
        budget: 200

        blue:
        mood: relaxed
        budget: 150

        orange:
        mood: nervous
        budget: 50

        red:
        mood: angry
        budget: 0
        * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your color of mood from those colors:\npink, blue, orange, red");
        String color = scan.nextLine();
        String mood ="";
        int budget =0;

        switch (color){
            case "pink":
                mood = "mood: happy";
                budget = 200;
                break;

            case "blue":
                mood ="mood: relaxed";
                budget=150;
                break;

            case "orange":
                mood ="mood: nervous";
                budget = 50;
                break;

            case "red":
                mood ="mood: angry";
                budget = 0;
                break;
        }
        System.out.println(mood+"\nbudget: " + budget);

    }
}
