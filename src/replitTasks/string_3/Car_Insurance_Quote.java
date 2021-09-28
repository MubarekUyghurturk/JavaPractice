package replitTasks.string_3;

import java.util.Scanner;

public class Car_Insurance_Quote {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String yesOrNo = scan.nextLine();

        if (yesOrNo.equals("No")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        if (yesOrNo.equals("Yes")){

            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();
            if (zipCode==20910 || zipCode==20740){
                premium += 60;
            }
            else if (zipCode==22102 || zipCode==22103){
                premium += 30;
            }
            else {
                premium += 50;
            }

            scan.nextLine();
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.nextLine();

            if (vehicleOwnership.equals("Owned")){
                premium += 10;
            }else if (vehicleOwnership.equals("Financed") || vehicleOwnership.equals("Leased")){
                premium += 20;
            }


            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.nextLine();
            if (vehicleUsage.equals("Business")){
                premium += 50;
            }
            else if (vehicleUsage.equals("Pleasure")){
                premium += 10;
            }
            else if (vehicleUsage.equals("Commute")) {
                premium += 20;


                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += daysDrivenToWorkOrSchool * 5;

                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool * 1;
            }


                System.out.println("How old are you?");
                int age = scan.nextInt();
                if (age<=16){
                    System.out.println("Invalid data!");
                    System.exit(0);
                }
                if (age>16 && age<18){
                    premium *= 20;
                }
                if (age>=18 && age<=21){
                    premium *= 6;
                }
                if (age>21 && age<25){
                    premium *=2;
                }


                System.out.println("How many years you've been driving?");
                int yearOfExperience = scan.nextInt();
                boolean valid = yearOfExperience>0;
                if (valid && age-yearOfExperience>=16 ){
                    premium -= 5*yearOfExperience;
                }
                else {
                    System.exit(0);
                }

                scan.nextLine();
                System.out.println("Have you had any accidents in the last 5 years?");
                String accident =scan.next();
                if (accident.equals("Yes")){

                    System.out.println("How many?");
                    accidentsAmount = scan.nextInt();
                    premium += premium*0.2*accidentsAmount;
                }


                System.out.println("Have you had continuous insurance for the past 12 months?");
                continuousInsurance = scan.next();
                if (continuousInsurance.equals("No")){
                    premium = premium*premium;
                }


            System.out.println("What is the highest level of education you have completed?");
            education = scan.next();
            if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Master")){
                premium -= premium*0.05;
            }
            if (education.equals("Doctors")){
                premium -= premium*0.1;
            }
            if (education.equals("Less than High school")){
                premium += premium*0.05;
            }

            System.out.println(name + ", here's your quote!\nStart Your Policy Today For: $"+ premium);
            System.out.println("Reference number: " + name.substring(0, 2).toUpperCase() +age + name.substring(name.length() - 2, name.length()).toUpperCase() + zipCode + education.replace(" ","").toUpperCase());


        }






















    }
}
