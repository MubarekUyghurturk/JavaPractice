package Canvas_HomeWork.loops_Practice3;

public class Reverse_Only_Second_Character_BySaim {
    public static void main(String[] args) {
       String s = "I love java";
       String fixedStr ="";

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == ' '){
                String revers ="";
                for (int j = s.lastIndexOf(' '); j >=i ; j--) {
                    revers += s.charAt(j);
                }
                fixedStr += revers;
                i = s.lastIndexOf(' ');
            }
            else {
                fixedStr += s.charAt(i);
            }
        }
        System.out.println(fixedStr);
    }
}
