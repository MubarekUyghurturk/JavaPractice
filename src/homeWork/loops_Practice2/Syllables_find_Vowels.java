package homeWork.loops_Practice2;

public class Syllables_find_Vowels {
    public static void main(String[] args) {
        String str ="java is great";

        int count = 0;
        String vowels = "aeiou";

        for (int i=0; i<str.length();i++){
            if (vowels.contains(str.substring(i,i+1))){
                count++;
            }
        }
        System.out.println("We have " + count + " vowels in this string.");



    }
}
