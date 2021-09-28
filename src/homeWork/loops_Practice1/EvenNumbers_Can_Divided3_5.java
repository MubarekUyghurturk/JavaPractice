package homeWork.loops_Practice1;

public class EvenNumbers_Can_Divided3_5 {
    public static void main(String[] args) {
        /*
        Write a program that can print all the EVEN numbers between 0 ~ 100
        that can be divisible by 3 & 5
        */
        for (int i = 0; i <=100; i++) {
            if (i%2==0 && i%3==0 && i%5==0){
                System.out.print(i + " ");
            }
        }
    }
}
