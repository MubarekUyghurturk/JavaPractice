package replitTasks.loops_4;

import java.util.Scanner;

public class Zombie_Attack_I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day=0;

        while (inhabitants >0){
            System.out.println("Day " + day + " [" + inhabitants + "]");
            day++;
            inhabitants -= inhabitants * 0.5;
        }
        System.out.println("---- EXTINCT ----");




    }
}
