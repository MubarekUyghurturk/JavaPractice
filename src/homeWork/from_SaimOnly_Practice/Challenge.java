package homeWork.from_SaimOnly_Practice;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String str = scan.nextLine();

        int count = 0;

        String result = "";
        while (true) {

            if (count == str.length()) {
                break;
            }
            String eachElement = "" + str.charAt(count++);
           // System.out.print(eachElement + "");
            if (!result.contains(eachElement)) {
                result = result + eachElement;
            }
        }
        System.out.println();
        System.out.println("result = " + result);











        //String result = "";

    }
//       while(true){
//
//           int frequency = 1;
//           if(count == str.length()-1){
//               break;
//           }
//           char eachElement = str.charAt(count++);
//
//
//           int innerCount =count-1;
//           while(true){
//               if(innerCount++ == str.length()-1){
//                   break;
//               }
//               if(eachElement == str.charAt(innerCount)){
//                   frequency++;
//               }
//           }
//
//           if(frequency == 1){
//               result += eachElement;
//           }
//       }
//
//
//        System.out.println("result = " + result);
//
//    }
}
