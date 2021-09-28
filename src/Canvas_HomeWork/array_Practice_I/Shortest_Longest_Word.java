package Canvas_HomeWork.array_Practice_I;

public class Shortest_Longest_Word {
    public static void main(String[] args) {
//TODO find logest and shortest element from String array
        String[] cities = {"Urumqi", "Aksu", "Qeshqer", "Hoten","CA"};

        int longest = 0;
        int shortest = 0;
        String  longString="";
        String shortString="";

        for (int i = 0; i < cities.length-1; i++) {
           // System.out.println(cities[i] + " has a size:  " + cities[i].length());
            longest = cities[0].length();
            shortest = cities[0].length();

            if (cities[i].length() > longest){
                longString = cities[i];
            }
            if (cities[i].length() < shortest){
                shortString = cities[i];
            }
        }
        System.out.println();
        System.out.println("Long string : " + longString);
        System.out.println("Short string will be:  " + shortString);


        }
    }

