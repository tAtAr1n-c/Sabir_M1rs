package Machine;

public class Bicycle extends Vehicle {

    private int gearCount;

    public Bicycle(String brand, int maxSpeed, int gearCount) {
        super(brand, maxSpeed);
        setGearCount(gearCount);
    }

    public int getGearCount(){
        return gearCount;
    }
    public void setGearCount(int gearCount){
        while(gearCount < 0 || gearCount > 81){
            System.out.println("Напиши заново количество скоростей от 0 до 81: ");
            gearCount = scanner.nextInt();
        }
        this.gearCount = gearCount;
    }

    @Override
    public void move(){
        System.out.println(getBrand() + " Едет по велодорожке");
    }
    public void changeGear(int gearCount){
        setGearCount(gearCount);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Gear Count: " + getGearCount());
        System.out.println();
    }
}
