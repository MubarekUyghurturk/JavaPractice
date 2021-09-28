package replitTasks.string_3;

import java.util.Scanner;

public class Get_Sandwich3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();

        /*String  firstBread = str.substring(str.indexOf("bread"),str.indexOf("bread")+5);
        String secondBread = str.substring(str.indexOf("bread", length + 1),str.indexOf("bread", length + 1)+5);
        String wordsBetweenTwoBread = str.substring(str.indexOf(firstBread), str.indexOf(secondBread));
*/

        if(str.indexOf("bread") == str.lastIndexOf("bread")) {

                System.out.println("nothing");

        }
        else {
            System.out.println(str.substring( str.indexOf("bread") + 5, str.lastIndexOf("bread") ));
        }

    }
}
