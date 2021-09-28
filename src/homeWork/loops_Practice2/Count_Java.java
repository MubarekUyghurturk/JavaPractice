package homeWork.loops_Practice2;

public class Count_Java {
    public static void main(String[] args) {

        System.out.println();

        String str = "java is a language. java can be used for alot java";

        int java=0;
        for (int i=0; i<str.length()-3;i++) {

            if (str.substring(i, i + 4).equals("java")) {
                java++;
            }
        }

        System.out.print("There are " + java + " times shows up");
    }
}
