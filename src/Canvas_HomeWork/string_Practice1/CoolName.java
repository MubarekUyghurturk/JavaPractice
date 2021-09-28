package Canvas_HomeWork.string_Practice1;

import java.util.Scanner;

public class CoolName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        if (name.startsWith("a") || name.startsWith("z") ){
            System.out.println("Your name is cool");
        }
        else if (name.endsWith("m")){
            System.out.println("Almost coll");
        }
        else {
            System.out.println("Sorry not a cool name");
        }

    }
}
