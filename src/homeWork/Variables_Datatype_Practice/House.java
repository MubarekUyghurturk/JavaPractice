package homeWork.Variables_Datatype_Practice;

public class House {
    public static void main(String[] args) {
        String houseType ="single house";
        byte numberOfBedrooms = 5;
        byte numberOfBathrooms = 5;
        byte numberOfKitchen =2;
        byte ratingOfSchoolsNearBy = 9;

        boolean isBasement= true;
        boolean isAttic = true;
        boolean isPool =true;
        boolean isHouseForSale =false;
        boolean isParkNearBy = true;


        int costOfTheHouse = 650_000;
        int zipcode =94086;

        String address = "321 sunnyvale street, Powell,Ohio";

        System.out.println();

        System.out.println("The houe is ===> "+ houseType);
        System.out.println("The house has "+ numberOfBedrooms+" bed room and "+
                numberOfBathrooms+" bathroom."+ numberOfKitchen+" kitchens. It has a basement "+ isBasement+" , attic "+ isAttic+" and pool "+ isPool+ " . But it is not for sale "+ isHouseForSale );
        System.out.println("");
    }
}
