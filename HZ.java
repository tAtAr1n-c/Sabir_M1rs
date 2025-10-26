import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String str = scanner.nextLine();
        if(str.matches("[A-Z][a-z]*|[А-Я][а-я]*}")) System.out.println(str);
        else System.out.println("ВВеди имя верно");
    }
}
