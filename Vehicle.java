package Machine;
import java.util.Scanner;

public class Vehicle {
    protected Scanner scanner = new Scanner(System.in);
    private String brand;
    private int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        setBrand(brand);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        while(maxSpeed < 0){
            System.out.println("Не троль меня я сейчас сломаюсь давай нормальное число > 0: ");
            maxSpeed = scanner.nextInt();
        }
        this.maxSpeed = maxSpeed;
    }


    public void move(){}
    public void stop(){}
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed);
    }



}
