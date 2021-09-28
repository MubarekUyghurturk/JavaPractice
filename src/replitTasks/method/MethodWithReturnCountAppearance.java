package replitTasks.method;

import java.util.Scanner;

public class MethodWithReturnCountAppearance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));

    }

    public static int countAppearance(String[] arr,String t){
        int count=0;
        for (String each : arr){
            if (each.equals(t)){
                count++;
            }
        }
        return count;
    }
}
