package DZOOP;
import java.util.Scanner;

public class Car {
    private static Scanner scanner = new Scanner(System.in);
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
        setYear(year);
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

    public void displayInfo(){
        String x = "Брэнд: " + brand + "\nМодель: " + model + "\nГод выпуска: " + year + "\nЦвет: " + color + "\nЦена: " + price + "\nЗаведена ли: " + isRunning + "\nПробег: " + mileage;
        System.out.println(x);
    }

    public void setYear(int year){
        while(year < 1885 || year > 2025){
            System.out.println("Введи нормальное");
            year = scanner.nextInt();
        }
        this.year = year;
    }

    public void setRunning(boolean isRunning){
        this.isRunning = isRunning;
    }

    public void startEngine(){
        setRunning(true);
    }

    public void stopEngine(){
        setRunning(false);
    }

    public void drive(int x){
        if(x > 0){
            mileage += x;
        }else{
            throw new IllegalArgumentException("ТЫ ЗАЧЕМ ПРОБЕГ СКРУЧИВАЕШЬ");
        }
    }

    public void repaint(String color){
        this.color = color;
    }

    public void updatePrice(int price){
        this.price = price;
    }

}
