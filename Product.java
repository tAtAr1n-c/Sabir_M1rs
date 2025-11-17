package DZOOP;
import java.util.Scanner;
public class Product {
    Scanner scanner = new Scanner(System.in);
    private Product[] korz = new Product[totalProduct];
    private static final String storeName = "Супермаркет 'У дома'";
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;
    private static int totalProduct = 0;


    public Product(String name, double price, String category, boolean inStock, int quantity) {
        setName(name);
        setPrice(price);
        setCategory(category);
        setInStock(inStock);
        setQuantity(quantity);
        totalProduct++;
    }
    public Product(String name, double price, String category) {
        this(name , price, category , false , 0 );
        totalProduct++;
    }
    public Product(){
        this("000", 0, "000", false, 0);
        totalProduct++;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        while(price < 0 || price > 1_000_000){
            System.out.println("Price one more time pls...");
            price = scanner.nextDouble();
        }
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isInStock() {
        return inStock;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        while(quantity < 0){
            System.out.println("Quantity less than 0");
            quantity = scanner.nextInt();
        }
        this.quantity = quantity;
    }



    public String displayInfo(){
        String x = "Название: " + name + "\nЦена: " +  price + "\nКатегория: " + category + "\nНаличие: " + inStock + "\nКоличество: " + quantity;
        return x;
    }
    public void applyDiscount(double percent){
        double newPrice = price * (1 - percent);
        this.price = newPrice;
    }
    public void applyDiscount(double percent, String promoCode){
        double newPrice = price * (1 - percent);
        this.price = newPrice;
        System.out.println("Ваш промокод был успешно применен");
    }
    public void restock(int amount){
        if(amount >0){
            this.quantity += amount;
        }
    }
    public void restock(int amount, String supplier){
        if(amount > 0){
            this.quantity += amount;
            System.out.println("Продукцию привез потставщик: " + supplier);
        }
    }
    public void sell(int amount){
        if(amount > 0 && quantity >= amount){
            quantity -= amount;
        }else{
            System.out.println("Товара на складе не хватает. Есть только: " + quantity);
        }
    }
    public void addProduct(Product product){
        Product[] k = new Product[totalProduct + 1];
        for(int i = 0; i < totalProduct; i++){
            k[i] = korz[i];
        }
        k[totalProduct] = product;
        this.korz = k;
    }
    public static double calculateTotalValue(Product[] product){
        double total = 0;
        for(int i = 0; i < product.length; i++){
            total += product[i].getPrice();
        }
        return total;
    }

}
