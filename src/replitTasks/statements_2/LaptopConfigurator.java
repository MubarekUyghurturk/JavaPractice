package replitTasks.statements_2;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        double laptopPrice =0;
        System.out.println("Select screen size:");
        double screenSize = scn.nextDouble();
        if (screenSize == 13.3){
            laptopPrice += 200;
        }
        else if (screenSize == 15.0){
            laptopPrice += 300;
        }
        else if (screenSize == 17.3){
            laptopPrice += 400;
        }


        System.out.println("Select CPU type:");
        String cpu = scn.next();
        if (cpu.equals("i3")){
            laptopPrice += 150;
        }
        else if (cpu.equals("i5")){
            laptopPrice += 250;
        }
        else if (cpu.equals("i7")){
            laptopPrice += 350;
        }


        System.out.println("Select RAM size:");
        int ramSize = scn.nextInt();
        if (ramSize%4==0 && ramSize>=4){
            laptopPrice += (ramSize/4)*50;
        }

        System.out.println("Select storage type:");
        String storageType = scn.next();

        System.out.println("Enter memory size:");
        int memorySize = scn.nextInt();

        if (storageType.equals("HDD")) {
            if (memorySize % 500 == 0 && memorySize >= 500) {
                laptopPrice += (memorySize / 500) * 50;
            }
        }
        else if (storageType.equals("SSD")){
            if (memorySize%500==0 && memorySize>=500){
                laptopPrice += (memorySize/500)*100;
                }
            }


        System.out.println("Enter screen resolution:");
        String resolution = scn.next();
        if (resolution.equals("FULLHD")){
            laptopPrice += 100;
        }
        else if (resolution.equals("4K")){
            laptopPrice += 200;
        }


        System.out.println("Laptop price is: $" + laptopPrice);




    }
}
