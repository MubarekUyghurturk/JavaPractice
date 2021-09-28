package Canvas_HomeWork.array_Practice_I;

public class Max_and_Min_Numbres {
    public static void main(String[] args) {
        int[] numbers ={34,25,65,23,43,65,53,-22,-13};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <=numbers.length-1; i++) {
           // numbers[i]
            if (numbers[i]>max){
                max = numbers[i];
            }
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("Max number from the array is: " + max + "\nMinimum number from the array is: " + min);
    }
}
