package replitTasks.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        //System.out.println(timesTwo(list));

    }

    /*public static ArrayList<Integer> timesTwo (Integer an){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i <an; i++) {

        }

    }
*/
}
