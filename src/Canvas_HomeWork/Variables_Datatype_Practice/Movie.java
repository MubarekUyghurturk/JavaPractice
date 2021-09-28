package Canvas_HomeWork.Variables_Datatype_Practice;

public class Movie {
    public static void main(String[] args) {
        String name = "Black widow";
        String genre ="Action";
        float duration = 2.14f;
        String releaseDate ="07_09_2021";
        boolean isSquels = false;
        boolean isOnDVD = false;
        byte rottenTomatoesRating = 80;
       String rating ="PG";


        System.out.println();
        System.out.println(" ------ Welcome to the Cinema ------");
        System.out.println("Tonight we are streaming "+"\"" + name + "\" " +" which was released on "+releaseDate+" .");
        System.out.println("This "+ genre +" movie got a "+ rottenTomatoesRating+"% rating on Rotten Tomatoes.");
        System.out.println("The rating is "+rating +" and it runs for "+ duration + " hours.");
        System.out.println("This is a squel "+ isSquels + " and is on dvd "+ isOnDVD);


    }
}
