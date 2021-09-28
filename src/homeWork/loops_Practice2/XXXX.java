package homeWork.loops_Practice2;

public class XXXX {
    public static void main(String[] args) {

        String str = "java java java 2 a language. java 3 be used for alot python python";


        System.out.println(str.replace("\\d", ""));
        System.out.println(str.replaceAll("\\D", ""));

//        System.out.println("first java " + str.indexOf("java"));
//        System.out.println("second java " + str.indexOf("java", str.indexOf("java")+4));

        int countJava = 0;
        int countPython = 0;
        while(true){
            if(str.indexOf("java") == -1){
                break;
            }
            str = str.replaceFirst("java","");
            System.out.println("str = " + str);
            countJava++;
        }

        while(true){
            if(str.indexOf("python") == -1){
                break;
            }
            str = str.replaceFirst("python","");
            System.out.println("str = " + str);
            countPython++;
        }
        boolean result = countJava == countPython ? true: false;

        System.out.println("result = " + result);


    }
}
