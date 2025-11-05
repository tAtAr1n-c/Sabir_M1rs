package DZOOP;

public class Lola {
    public static void main(String[] args){
        MobilePhone iphone =  new MobilePhone("Iphone", "17 pro max", 256, 64, true);
        iphone.chargeBattery(48);
        System.out.print(iphone.displayInfo());
    }
}
