package Canvas_HomeWork.loops_Practice1;

public class SumOf_OddNumbers {
    public static void main(String[] args) {
        /*
        Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        */

        int sum =0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2 != 0){
                sum += i;
            }
        }
        System.out.println( "Sum of all the odd numbers between 1~100 is: " + sum);
    }
}
