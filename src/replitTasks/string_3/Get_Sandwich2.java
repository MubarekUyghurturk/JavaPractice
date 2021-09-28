package replitTasks.string_3;

import java.util.Scanner;

public class Get_Sandwich2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();


         //"breadbutterbread"; //"xxbreadjambreadyy"

        String bread = "bread";
        int length = bread.length();  // 5

        System.out.println("The length of the word \"bread\" is:  " + length);
        /*it will return the starting index number of the word 'bread'. when we add 5(the length of the word 'bread') to this starting index number
         then we will get the first index number of the word just coming after the 'bread'*/
        System.out.println("The first index number of the first \'bread\' is:   " + str.indexOf("bread"));
        System.out.println("First index number of the word after first \"bread\" is: " + (str.indexOf("bread")+5));
          String  firstBread = bread.substring(str.indexOf("bread"),str.indexOf("bread")+5);
          String secondBread = bread.substring(str.indexOf("bread", length + 1),str.indexOf("bread", length + 1)+5);

        /*if (str.indexOf("bread", (length + 1))<0){
            System.out.println("There is only one letter \"bread\" ");
        }*/

        int firstIndexNumberOfSecondBread =str.indexOf("bread", length + 1);
        int lastIndexNumberOfSecondBread = firstIndexNumberOfSecondBread+5;
        System.out.println("first index number of the second 'bread' is:  " + str.indexOf("bread", length + 1));
        System.out.println("Last index number of the second \"bread\" is:   " + lastIndexNumberOfSecondBread);


        System.out.println("The word between the two \"bread\" is:  "+ str.substring(str.indexOf("bread") + 5, str.indexOf("bread", length + 1)));


        System.out.println("Print out last \" bread\" :   " + str.substring(firstIndexNumberOfSecondBread, lastIndexNumberOfSecondBread));


    }
}
