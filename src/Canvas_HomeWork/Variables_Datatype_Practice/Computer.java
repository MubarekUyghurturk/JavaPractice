package Canvas_HomeWork.Variables_Datatype_Practice;

public class Computer {
    public static void main(String[] args) {
        String brand ="MacBook Pro";
        String processor ="2.3 Ghz Intel Core i6";
        String ramMemory ="8GB";
        boolean hasMonitor = true;
        boolean hasWifiCard = false;
        int price =3000;
        String color ="pink";
        byte numberOfMonitor =2;
        byte numberOfUSBSlots = 2;

        System.out.println("My laptop brand is: "+ brand);
        System.out.println("It's processor is: "+ processor);
        System.out.println("Laptop color is "+color+", ram memory is "+ ramMemory+", it has monitor "+ hasMonitor +", it has wifi card "+ hasWifiCard+", it cost "+ price+".");
    }
}
