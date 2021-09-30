package Canvas_HomeWork.ArrayList_Practice_I;

import java.util.ArrayList;
import java.util.Collections;

public class Hide_Password {
    public static void main(String[] args) {
        String[] password = {"one","hi","hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>(password.length);
        hiddenPassword.add(password[0].replace("one","***"));
        hiddenPassword.add(password[1].replace("hi","**"));
        hiddenPassword.add(password[2].replace("hold","****"));

        System.out.println(hiddenPassword);

    }
}
