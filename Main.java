package Machine;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 180, "Дизель", 140, 80);
        Bicycle bac1 = new Bicycle("Stels", 30, 8);
        Motorcycle mac1 = new Motorcycle("FAS", 420, 12);
        Vehicle[] vehicles = {
                new Car("BMW", 240, "Электрическая", 123, 89),
                new Car("Audi", 200, "Бензин", 200, 46),
                new Bicycle("BMX", 80, 76),
                new Motorcycle("Yakudza", 320, 8)
        };
        for(Vehicle vehicle : vehicles) {
            if(vehicle instanceof Car car){
                car.move();
            }else if(vehicle instanceof Bicycle bicycle){
                bicycle.move();
            }else if(vehicle instanceof Motorcycle motorcycle){
                motorcycle.move();
            }
        }
        car1.refuel(61);
        bac1.changeGear(18);
        mac1.wheelie();
    }
}
