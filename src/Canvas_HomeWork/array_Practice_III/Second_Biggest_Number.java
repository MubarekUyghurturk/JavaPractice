package Canvas_HomeWork.array_Practice_III;

import java.util.Arrays;

public class Second_Biggest_Number {
    public static void main(String[] args) {
        int[] numbers ={4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));  //  [1, 2, 3, 4, 4, 4, 4, 5, 8, 8]

        String nunDuplicatedNumber = "";
        for (int i = 0; i <numbers.length; i++) {
            String each = "" + numbers[i];
            if (!nunDuplicatedNumber.contains(each)){
                nunDuplicatedNumber += each;
            }
        }
       // System.out.println(nunDuplicatedNumber); // "123458"
        char[] nunDuplicatedNumbers = nunDuplicatedNumber.toCharArray(); // String converted to char array like ==>  [1, 2, 3, 4, 5, 8]
        int secondBiggest = nunDuplicatedNumbers.length-1;
        System.out.println(secondBiggest); // 5








        /*int max = 0;
        for (int i = numbers.length-2; i >=0; i--) {

            if (numbers[i] != numbers[numbers.length-1]){
               max = numbers[i];
            }
        }
        System.out.println(max + " is a second largest number");*/


    }
}
