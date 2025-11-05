package DZOOP;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private int mileage;
    public Car(String brand, String model, int year, String color, double price, boolean isRunning, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }
    public Car(String brand, String model, int year){
        this(brand, model, year, "Base", 0, false, 0);
    }
    public Car(){
        this("NIKAKA", "OOOO", 0,"Base", 0,  false, 0);
    }
    public String displayInfo(){
        String x = "Брэнд: " + brand + "\nМодель: " + model + "\nГод выпуска: " + year + "\nЦвет: " + color + "\nЦена: " + price + "\nЗаведена ли: " + isRunning + "\nПробег: " + mileage;
        return x;
    }
    public void startEngine(){
        isRunning = true;
    }
    public void stopEngine(){
        isRunning = false;
    }
    public void drive(int x){
        if(x > 0){
            mileage += x;
        }
    }
    public void repaint(String color){
        this.color = color;
    }
    public void updatePrice(int price){
        this.price = price;
    }
}
