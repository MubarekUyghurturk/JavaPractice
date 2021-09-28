package replitTasks.method;

import java.util.Scanner;

public class FindCube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        cube(num);
    }


    public static void cube(int num){
        int cube = num*num*num;
        System.out.println(cube);
    }
}
