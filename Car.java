package Machine;
import java.util.Scanner;

public class Car extends Vehicle{

    private int maxFuel;
    private int fuelTi;
    private String fuelType;

    public Car(String brand, int maxSpeed, String fuelType,int maxFuel, int fuelTi) {
        super(brand, maxSpeed);
        setFuelType(fuelType);
        setMaxFuel(maxFuel);
        setFuelTi(fuelTi);
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        while (!fuelType.matches("Дизель|Бензин|Электрическая|Газ")) {
            System.out.println("Выбери нормальный тип для " + getBrand() + " из предложенных (Дизель, Бензин, Электрическая, Газ)");
            fuelType = scanner.nextLine();
        }
        this.fuelType = fuelType;
    }
    public void setMaxFuel(int maxFuel){
        if(fuelType.equals("Электрическая")){
            this.maxFuel = 100;
        }else{
            while(maxFuel < 0){
                System.out.println("Количество литров для "  + getBrand() + "" + fuelType +  " должно быть больше 0: ");
                maxFuel = scanner.nextInt();
            }
            this.maxFuel = maxFuel;
        }
    }
    public int getMaxFuel(){
        return maxFuel;
    }
    public int getFuelTi() {
        return fuelTi;
    }
    public void setFuelTi(int fuelTi){
        while(fuelTi < 0 || fuelTi > maxFuel){
            if(getFuelType().equals("Электрическая")){
                System.out.println("Заряд машины на данный момент для " + getBrand() + " должен быть больше 0 и меньше 100");
                fuelTi = scanner.nextInt();
            }else{
                System.out.println("Количество литров на данный для"  + getBrand() + "момент должно быть больше 0 и меньше " + getMaxFuel());
                fuelTi = scanner.nextInt();
            }
        }
        this.fuelTi = fuelTi;
    }

    @Override
    public void move(){
        System.out.println(getBrand() + " Едет по дороге");
    }
    public void refuel(int skok){
        if(getFuelType().equals("Электрическая")){
            if (getFuelTi() + skok > getMaxFuel()) {
                System.out.println(skok + "% такое количество переполнит аккумулятор зарядка на машине " + getBrand() + " дойдет до 100% и остановиться");
                setFuelTi(100);
            }else{
                setFuelTi(getFuelTi() + skok);
            }
        }else{
            if (getFuelTi() + skok > getMaxFuel()) {
                System.out.println(skok + " Литров такое количество переполнит бак на машине " + getBrand() + " . Он наполнится до " +  getMaxFuel() + " и остановится");
                setFuelTi(getMaxFuel());
            }else{
                setFuelTi(getFuelTi() + skok);
            }
        }
    }
    @Override
    public void displayInfo(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("MaxFuel: " + getMaxFuel());
        System.out.println("Fuel Ti: " + getFuelTi());
        System.out.println();

    }
}
