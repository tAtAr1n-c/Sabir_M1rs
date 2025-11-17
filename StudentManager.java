package Universitet;
import java.util.Scanner;

public class StudentManager {
    private Scanner scanner = new Scanner(System.in);
    private static Student[] students;
    private static Course[] courses;
    private static Departament[] departaments;


    public static void addStudent(Student student){
        Student[] st = new Student[students.length + 1];
        for(int i = 0; i < students.length; i++){
            st[i] = students[i];
        }
        st[students.length] = student;
        students = st;
    }
    public static void addCourse(Course course){
        Course[] co = new Course[courses.length + 1];
        for(int i = 0; i < courses.length; i++){
            co[i] = courses[i];
        }
        co[courses.length] = course;
        courses = co;
    }
    public static void addDepartament(Departament departament){
        Departament[] d = new Departament[departaments.length + 1];
        for(int i = 0; i < departaments.length; i++){
            d[i] = departaments[i];
        }
        d[departaments.length] = departament;
        departaments = d;
    }


    public void findStudentById(String studentId){
        for(int i = 0; i < students.length; i++){
            if (students[i].getStudentId().equals(studentId)){
                System.out.println(students[i].displayInfo());
                System.out.println();
            }else{
                System.out.println("Such a student does not exist");
            }
        }
    }
    public void getStudentByFaculty(String faculty){
        boolean flag = true;
        for(int i = 0; i < students.length; i++){
            if (students[i].getFaculty().equals(faculty)){
                System.out.println(students[i].displayInfo());
                System.out.println();
                flag = false;
            }
        }
        if(flag) System.out.println("There are no students in this faculty");
    }
    public void calculateAverageFaculty(String faculty){
        double sum = 0;
        int count = 0;
        boolean flag = true;
        for(int i = 0; i < students.length; i++){
            if (students[i].getFaculty().equals(faculty)){
                sum += students[i].getAverageGrade();
                count++;
                flag = false;
            }
        }
        if(flag) System.out.println("There are no students in this faculty");
        System.out.println("Average grade is " + sum/count);
    }


    public static Student[] getStudents() {return students;}
    public static Departament[] getDepartments() {return departaments;}
    public static Course[] getCourses() {return courses;}
}
