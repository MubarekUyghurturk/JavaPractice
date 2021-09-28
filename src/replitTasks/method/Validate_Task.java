package replitTasks.method;

import java.util.Scanner;

public class Validate_Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
    }


    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        // your code here
        //taskId = currentId+1;
        boolean result =false ;
        if (notEmpty & taskId == currentId+1) { // t8   c7
                result = true;
        }
        else {
            result=false;
        }
        return result;


    }


}
