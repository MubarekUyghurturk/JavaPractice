package replitTasks.loops_4;

import java.util.Scanner;

public class Print_Letter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);


        for (int i=start;i<=end;i++){
            System.out.print((char)i);
        }
    }
}
