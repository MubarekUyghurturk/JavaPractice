package replitTasks.loops_4;

public class Utopian_Tree {
    public static void main(String[] args) {

        int year=1;
        int size=0;

        for (int i=0; i<=10; i++) {

            if (year <= 3) {
                System.out.println("year " + year++ + " - growth 1 cm\ntree size: " + ++size + "cm");
            }
            System.out.println();
            if (year>3 && year<=10){
                size= size+2;
                System.out.println("year " + year++ + " - growth 2 cm\ntree size: " + size + "cm");
            }
        }



    }
}
