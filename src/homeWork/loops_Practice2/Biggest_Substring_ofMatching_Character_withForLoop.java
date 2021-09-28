package homeWork.loops_Practice2;

import java.util.Scanner;

public class Biggest_Substring_ofMatching_Character_withForLoop {
    /*Biggest substring of matching characters
    Given a String find the biggest substring of chars that match and print it.
    Ex: aaabbbcccccddddee
    Output: ccccc
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentences: ");
        String str = scan.nextLine();

        String newString ="";
        for (int i=0; i<str.length();i++){
            String eachElement = "" +  str.charAt(i);

            if (!newString.contains(eachElement)){
                newString += eachElement;
            }
        }
        System.out.println("unique part will be ===> " + newString);

       int biggestSize = 0;
       int indexOfBiggestSize = 0;
        for (int i=0;i<newString.length();i++){
            int count =0;
            for (int j=0; j<str.length();j++){
                if(newString.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
           if(count > biggestSize){
               biggestSize = count;
               indexOfBiggestSize = i;
           }
        }
        for (int i = 0; i < biggestSize; i++) {
            System.out.print(newString.charAt(indexOfBiggestSize));
        }

    }
}
