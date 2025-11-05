package DZOOP;

public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;
    public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
    }
    public MobilePhone(String brand, String model, int storageGB) {
        this(brand, model, storageGB, 0, false);
    }
    public MobilePhone(){
        this("ХХ", "ХХ", 0, 0, false);
    }
    public String displayInfo(){
        String x = "Брэнд: " + brand + "\nМодель: " + model + "\nПамять: " + storageGB + "\nЗардяка: " + batteryLevel + "\nВключен ли он: " + isPoweredOn;
        return x;
    }
    public void powerOn(){
        isPoweredOn = true;
    }
    public void powerOff(){
        isPoweredOn = false;
    }
    public void chargeBattery(int percent){
        int x = batteryLevel;
        int k = 0;
        System.out.println("Телефон заряжается");
        while(x < 100 && k < percent){
            x++;
            k++;
            System.out.println(x + "%");
        }
        batteryLevel = x;
    }
    public void useBattery(int percent){
        int x = batteryLevel;
        int z = 0;
        System.out.println("Зардяка тратиться");
        while(x < 100 && z < percent){
            x--;
            z++;
            System.out.println(x + "%");
        }
        batteryLevel = x;
    }

}

