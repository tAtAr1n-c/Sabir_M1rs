package Universitet;
import java.util.Scanner;
public class Student {
    private Scanner scanner = new Scanner(System.in);
    private final String universityName = "KFU";
    private static int totalStudent = 0;

    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;
    private String faculty;
    private String coco;


    public Student(String studentId, String firstName, String lastName, int age, double averageGrade, String faculty) {
        setStudentId(studentId);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setAverageGrade(averageGrade);
        setFaculty(faculty);
        totalStudent++;
        StudentManager.addStudent(this);
    }


    public String getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public double getAverageGrade() {
        return averageGrade;
    }
    public String getUniversityName() {
        return universityName;
    }
    public String getFaculty() {
        return faculty;
    }
    public static int getTotalStudent(){
        return totalStudent;
    }


    public void setStudentId(String studentId){
        while(studentId == null || studentId.isEmpty()){
            System.out.print("Student ID: ");
            studentId = scanner.nextLine();
        }
        this.studentId = studentId;
    }
    public void setFirstName(String firstName){
        while(firstName == null || firstName.isEmpty()){
            System.out.print("First Name: ");
            firstName = scanner.nextLine();
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        while(lastName == null || lastName.isEmpty()){
            System.out.print("Last Name: ");
            lastName = scanner.nextLine();
        }
        this.lastName = lastName;
    }
    public void setAge(int age){
        while(age < 0 || age > 100){
            System.out.println("Age: ");
            age = scanner.nextInt();
        }
        this.age = age;
    }
    public void setAverageGrade(double averageGrade){
        while(averageGrade < 0.0 || averageGrade > 5.0){
            System.out.println("Average grade: ");
            averageGrade = scanner.nextDouble();
        }
        this.averageGrade = averageGrade;
    }
    public void setFaculty(String faculty){
        while(faculty == null || faculty.isEmpty()){
            System.out.println("Faculty: ");
            faculty = scanner.nextLine();
        }
        this.faculty = faculty;
    }


    public String displayInfo(){
        return "First Name: " + getFirstName() + "\nLastName: " +  getLastName() + "\nFaculty: " + getFaculty();
    }
    public String displayInfo(boolean detailed){
        if(detailed){
            return "Student ID: " + getStudentId() + "\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nAge: " +  getAge() + "\nAverageGrade: " + getAverageGrade() +"\nUniName: " + getUniversityName() + "\nFaculty: " + getFaculty();
        }
        else{
            return "Student ID" +  getStudentId();
        }
    }
    public void updateGrade(double grade){
        setAverageGrade(grade);
    }
    public void updateGrade(double grade, String subject){
        System.out.println("Student ID: " +  getStudentId());
        System.out.println("The grade for the "+ subject + " has been changed");
        setAverageGrade(grade);
    }


}
