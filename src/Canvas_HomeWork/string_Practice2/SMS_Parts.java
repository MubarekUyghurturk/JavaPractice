package Canvas_HomeWork.string_Practice2;

public class SMS_Parts {
    public static void main(String[] args) {


        String str = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

        System.out.println(" " + str.substring(0, str.indexOf(" ")) + str.substring(str.indexOf("<")+1,str.indexOf(">")));

        System.out.println(" " + str.substring(str.indexOf("N"), str.indexOf("[")) +  str.substring(str.indexOf("[")+1 , str.indexOf("]"))  );


        System.out.println(" " + str.substring(str.indexOf("M"), str.indexOf("{")) + str.substring(str.indexOf("{")+2, str.indexOf("}") ));


    }
}
