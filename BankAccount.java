package DZOOP;
import java.util.Scanner;

public class BankAccount {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalAccount = 0;
    private static final String bankName = "Национальный банк";
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;


    public BankAccount(String accountNumber, String ownerName, double balance,String currency, boolean isActive) {
        setAccountNumber(accountNumber);
        setOwnerName(ownerName);
        setBalance(balance);
        setCurrency(currency);
        setIsActive(isActive);
        totalAccount++;
    }
    public BankAccount(String accountNumber, String ownerName){
        this(accountNumber,ownerName,0,"AED",true);
        totalAccount++;
    }
    public BankAccount(){
        this("Имя", "Фамилия", 0, "AED", false);
        totalAccount++;
    }


    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public String getCurrency() {
        return currency;
    }
    public boolean isActive() {
        return isActive;
    }



    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setBalance(double balance) {
        while(balance < 0 && balance > 1_000_000_000){
            System.out.println("Многовато или маловато у тебя денег ПОПРОСИ ЧУТЬ меньше или больше...");
            balance = scanner.nextDouble();
        }
        this.balance = balance;
    }
    public void  setCurrency(String currency) {
        this.currency = currency;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }



    public static double calculateInterest(double amount, double rate, int years){
        return amount + (1 + rate / 100);
    }
    public String displayInfo(){
        String x ="Название банка: " + bankName + "\nНомер счета: " + accountNumber + "\nИмя владельца: " + ownerName + "\nБаланс: " + balance + "\nВалюта: " + currency + "\nАвтивность: " + isActive;
        return x;
    }
    public String displayInfo(boolean showStatus){
        return "Не сильно понимаю что тут должно было быть, но пусть будет это....." + showStatus;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void deposit(double amount, String description){
        balance += amount;
        System.out.println(description);
    }
    public void withdraw(double amount){
        if(amount > balance) {
            throw new IllegalArgumentException("Не хватает денег на счете!!!");
        }
        balance -= amount;
    }
    public void withdraw(double amount, String purpose){
        while(amount > balance) {
            System.out.println("Столько денег нема давай чуть меньше...");
            amount = scanner.nextDouble();
        }
        balance -= amount;
        System.out.println(purpose);
    }

    public void activateAccount(){
        isActive = true;
    }
    public void deactivateAccount(){
        isActive = false;
    }

}
