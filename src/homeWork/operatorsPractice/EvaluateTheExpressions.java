package homeWork.operatorsPractice;

public class EvaluateTheExpressions {
    public static void main(String[] args) {
        int a ,b;
        a=1;
        b=-a-- + a++/-a--*--a;
        System.out.println(a +" and " + b);

        int x=8;
        int y=x--;
        x--;
        System.out.println(x);

        int A =50;
        int B= --A + A++ + A-- + A++;
        System.out.println(A + " and " + B);

    }
}
