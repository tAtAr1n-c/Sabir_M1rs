package Universitet;
import java.util.Scanner;
public class Departament {
    private Scanner scanner = new Scanner(System.in);
    private final static double uniBudget = 100_000_000;
    public static int totalDepartaments = 0;
    private String departamentName;
    private String headOfDepartament;
    private String officeRoom;
    private String email;
    private String phoneNumber;
    private double budget;


    public Departament(String departamentName, String headOfDepartament, String officeRoom, String email, String phoneNumber, double budget){
        setDepartamentName(departamentName);
        setHeadOfDepartament(headOfDepartament);
        setOfficeRoom(officeRoom);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setBudget(budget);
        totalDepartaments++;
        StudentManager.addDepartament(this);
    }
    public Departament(String departamentName, String headOfDepartament, String officeRoom){
        this(departamentName, headOfDepartament, officeRoom, "email@gmail.com", "+79999999999", 0);
        StudentManager.addDepartament(this);
    }
    public Departament(){
        this("n", "n", "n", "email@gmail.com", "+79999999999", 0);
        StudentManager.addDepartament(this);
    }


    public String getDepartamentName(){
        return departamentName;
    }
    public String getHeadOfDepartament(){
        return headOfDepartament;
    }
    public String getOfficeRoom(){
        return officeRoom;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public double getBudget(){
        return budget;
    }
    public int getTotalDepartaments(){
        return totalDepartaments;
    }
    public double getUniBudget(){
        return uniBudget;
    }


    public void setDepartamentName(String departamentName){
        while(departamentName == null){
            System.out.println("Departament name is null. Again pls: ");
            departamentName = scanner.nextLine();
        }
        this.departamentName = departamentName;
    }
    public void setHeadOfDepartament(String headOfDepartament){
        while(headOfDepartament == null){
            System.out.println("Departament name is null. Again pls: ");
            headOfDepartament = scanner.nextLine();
        }
        this.headOfDepartament = headOfDepartament;
    }
    public void setOfficeRoom(String officeRoom){
        while(officeRoom == null){
            System.out.println("Office room is null. Again pls: ");
            officeRoom = scanner.nextLine();
        }
        this.officeRoom = officeRoom;
    }
    public void setEmail(String email){
        while(!validateEmail(email)){
            System.out.println("Email ist leer invalid. Again pls: ");
            email = scanner.nextLine();
        }
        this.email = email;
    }
    public static boolean validateEmail(String email){
        return email.matches("\\w+@([a-z0-9-_.]+)\\.(com|ru)");
    }
    public void setPhoneNumber(String phoneNumber){
        while(phoneNumber == null || !phoneNumber.matches("\\+7[0-9]{10}|")){
            System.out.println("Phone number ist leer invalid. Again pls: ");
            phoneNumber = scanner.nextLine();
        }
        this.phoneNumber = phoneNumber;
    }
    public void setBudget(double budget){
        while(budget < 0 || budget > getUniBudget()){
            System.out.println("Budget one more time pls: ");
            budget = scanner.nextDouble();
        }
        this.budget = budget;
    }


}
