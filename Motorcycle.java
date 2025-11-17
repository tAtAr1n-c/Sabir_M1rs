package Machine;

public class Motorcycle extends Vehicle{

    private int engineCapacity;

    public  Motorcycle(String brand, int maxSpeed, int engineCapacity) {
        super(brand, maxSpeed);
        setEngineCapacity(engineCapacity);
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(int engineCapacity) {
        while (engineCapacity < 0){
            System.out.println("Ты ваще дурак. Как у тебя объем отрицательный...");
            engineCapacity = scanner.nextInt();
        }
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move(){
        System.out.println(getBrand() + " Мчится по шоссе");
    }
    public void wheelie(){
        System.out.println(getBrand() + " сделал вилли");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Engine Capacity: " + getEngineCapacity());
        System.out.println();
    }
}
