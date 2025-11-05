package DZOOP;

public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;
    public Product(String name, double price, String category, boolean inStock, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }
    public Product(String name, double price, String category) {
        this(name , price, category , false , 0 );
    }
    public Product(){
        this("000", 0, "000", false, 0);
    }
    public String displayInfo(){
        String x = "Название: " + name + "\nЦена: " +  price + "\nКатегория: " + category + "\nНаличие: " + inStock + "\nКоличество: " + quantity;
        return x;
    }
    public void applyDiscount1(double percent){
        double newPrice = price * (1 - percent);
        this.price = newPrice;
    }
    public void applyDiscount2(double price){
        this.price = price;
    }
    public void restock(int amount){
        if(amount >0){
            this.quantity += amount;
        }
    }
    public void sell(int amount){
        if(amount > 0 && quantity >= amount){
            quantity -= amount;
        }else{
            System.out.println("Товара на складе не хватает. Есть только: " + quantity);
        }
    }

}
