package DZOOP;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String currency;
    private boolean isActive;
    public BankAccount(String accountNumber, String ownerName, double balance,String currency, boolean isActive) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.currency = currency;
        this.isActive = isActive;
    }
    public BankAccount(String accountNumber, String ownerName){
        this(accountNumber,ownerName,0,"AED",true);
    }
    public BankAccount(){
        this("Имя", "Фамилия", 0, "AED", false);
    }
    public String displayInfo(){
        String x = "Номер счета: " + accountNumber + "\nИмя владельца: " + ownerName + "\nБаланс: " + balance + "\nВалюта: " + currency + "\nАвтивность: " + isActive;
        return x;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount > balance) {
            throw new IllegalArgumentException("Не хватает денег на счете!!!");
        }
        balance -= amount;
    }
    public void activateAccount(){
        isActive = true;
    }
    public void deactivateAccount(){
        isActive = false;
    }
}
