package replitTasks.string_3;

import java.util.Scanner;

public class Get_Sandwich {
    public static void main(String[] args) {

int count = 0;
        while (true){
            count++;
            if(count > 3){
                System.exit(1);
            }

        Scanner scan = new Scanner(System.in);
        String str = scan.next();



        if(str.indexOf("bread") == str.lastIndexOf("bread")){
            //if (str.substring(str.indexOf("bread"),str.indexOf("bread")+5))
            System.out.println("nothing");
        } else {
               System.out.println(str.substring( str.indexOf("bread") + 5, str.lastIndexOf("bread") ));
       }}
    }
}
