package replitTasks.arrays;

import java.util.Scanner;

public class Average_Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

       // int size = temps.length;
        double sum = 0;
        for (double temp : temps){
            sum += temp;
        }
        System.out.println(sum/8);
    }
}
