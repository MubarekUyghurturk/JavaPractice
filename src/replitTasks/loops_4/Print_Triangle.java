package replitTasks.loops_4;

import java.util.Scanner;

public class Print_Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String star ="";
        for (int i=1; i<=n;i++){
            star +="*" ;
            System.out.println(star);
        }
    }
}
