package Canvas_HomeWork.loops_Practice3;

public class Unique_Characters {
    public static void main(String[] args) {
        /*[IQ] Unique characters
        Given a String, find and print the unique characters. A character is unique if it only appears once in the String.       Ex:
               AAABCCDEEF
        Output:BDF
        */
        String str = "AAABCCDEEF";
        for (int i = 0; i < str.length(); i++) { // A
            int count=0;
            for (int j = 0; j < str.length(); j++) { // AABCCDEEF
                     //        A               AABCCDEEF
                if (str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            if (count<2){
                System.out.print(str.charAt(i)+ " ");
            }
        }


        }
    }

