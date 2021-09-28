package Canvas_HomeWork.loops_Practice3;

public class Duplicate_Characters {
    public static void main(String[] args) {
        /*[IQ] Duplicate characters
        Given a String, find and print the duplicate characters.
         A character is duplicate if it appears more than once in the String.
        Ex:
               AAABCCDEEF
        Output:ACE
        */

        String str ="AAABCCDEEF";
        String newString ="";
        for (int i = 0; i < str.length(); i++) { // A
            int count=0;
            for (int j = 0; j < str.length(); j++) { // AABCCDEEF
                //        A               AABCCDEEF
                if (str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            if (count>1){
               // System.out.print(str.charAt(i) + " ");
                String eachElements ="" + str.charAt(i);
               if (!newString.contains(eachElements) ){
                   newString += eachElements;
               }
            }
        }
        System.out.println(newString);



    }
}
