package Universitet;
import java.util.Scanner;

public class Course {
    private Scanner scanner = new Scanner(System.in);
    private static int totalCourses = 0;
    private final static int maxCreditsPerSemestr = 240;
    private String courseCode;
    private String courseName;
    private static int maxStudent = 20;
    private static int currentStudent = 0;
    private boolean isActive;

    public Course(String courseCode, String courseName, int maxStudent, int currentStudent, boolean isActive) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setMaxStudent(maxStudent);
        setCurrentStudent(currentStudent);
        setIsActive(isActive);
        totalCourses++;
        StudentManager.addCourse(this);
    }
    public Course(String courseCode, String courseName){
        this(courseCode, courseName, 0, 0, false);
        totalCourses++;
        StudentManager.addCourse(this);
    }
    public Course(){
        this("null", "null", 0, 0, false);
        totalCourses++;
        StudentManager.addCourse(this);
    }


    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getMaxStudent() {
        return maxStudent;
    }
    public int getCurrentStudent() {
        return currentStudent;
    }
    public boolean getIsActive() {
        return isActive;
    }
    public int getTotalCourses() {
        return totalCourses;
    }
    public int getMaxStudents() {
        return maxStudent;
    }
    public int getCurrentStudents() {
        return currentStudent;
    }
    public int  getMaxCreditsPerSemestr() {
        return maxCreditsPerSemestr;
    }


    public void setCourseCode(String courseCode){
        while(courseCode == null || courseCode.isEmpty()){
            System.out.println("Course Code: ");
            courseCode = scanner.nextLine();
        }
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName){
        while(courseName == null || courseName.isEmpty()){
            System.out.println("Course Name: ");
            courseName = scanner.nextLine();
        }
        this.courseName = courseName;
    }
    public void setMaxStudent(int maxStudent){
        while(maxStudent < 0){
            System.out.println("Student number: ");
            maxStudent = scanner.nextInt();
        }
        this.maxStudent = maxStudent;
    }
    public void setCurrentStudent(int currentStudent){
        while(currentStudent < 0 || currentStudent > maxStudent){
            System.out.println("Student number: ");
            currentStudent = scanner.nextInt();
        }
        this.currentStudent = currentStudent;
    }
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }


    public static void calculateWorkload(int credits){
        System.out.println("Workload: " + credits * totalCourses);
        if(credits * totalCourses > maxCreditsPerSemestr){
            System.out.println("Workload more than or equal to max credits!");
        }
    }
    public void enrollStudent(){
        if(maxStudent >= currentStudent + 1){
            currentStudent = currentStudent + 1;
            System.out.println("Student enrolled!");
        }
        else{
            System.out.println("Student not enrolled, not enough place!");
        }
    }
    public void enrollStudent(String studentId){
        if(maxStudent >= currentStudent + 1){
            currentStudent = currentStudent + 1;
            System.out.println("Student " + studentId +  " enrolled!" );
        }
        else{
            System.out.println("Student " + studentId + " not enrolled, not enough place!");
        }
    }
    public String displayInfo(){
        return "Course code: " + getCourseCode() + "\nCourse Name: " + getCourseName() + "\nMax student: " + getMaxStudent() + "\nCurrent student: " + getCurrentStudent() + "\nIs active: " +  getIsActive();
    }
    public String displyInfo(boolean showAvailability) {
        if (showAvailability) {
            return "Total Courses: " + getTotalCourses() + "\nCourse code: " + getCourseCode() + "\nCourse Name: " + getCourseName() + "\nMax student: " + getMaxStudent() + "\nCurrent student: " + getCurrentStudent() + "\nIs active: " + getIsActive();
        } else {
            return "Course code: " + getCourseCode() + "\nCourse Name: " + getCourseName() + "\nIs active: " + getIsActive();
        }
    }
}

