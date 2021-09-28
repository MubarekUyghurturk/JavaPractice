package homeWork.from_SaimOnly_Practice;

public class Min_Max_Number {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();*/

        int num=2;
        boolean b =true;
        switch (num){
            case 0:
                b=false;
            case 1:
                System.out.println(1);
            case 2:
                if (b){
                    System.out.println(2);
                }else {
                    b=false;
                }
            case 3:
                if (b){
                    System.out.println(3);
                    b=false;
                }else {
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if (!b){
                    break;
                }
                System.out.println(5);
        }




    }
}
