package replitTasks.method;

import java.util.Scanner;

public class MethodWithReturn3Locks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }



    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean istrue = false;
        if (a && b || c){
            istrue = true;
        }
        return istrue;
    }//end threeLocks


}
