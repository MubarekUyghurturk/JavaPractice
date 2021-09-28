package replitTasks.method;

import java.util.Scanner;

public class HamletLogic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
        boolean isTrue = false;
        if (toBe & notToBe ){
            isTrue = true;
        }
        else if (toBe | notToBe){
            isTrue = true;
        }
        else if (toBe && notToBe){
            isTrue=true;
        }
        return isTrue;
    }
}
