package replitTasks.loops_4;

import java.util.Scanner;

public class Print_n_Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String asterisks ="";
        for (int i=1;i<=n;i++){
            asterisks += "*";
        }
        System.out.print(asterisks);

    }
}
