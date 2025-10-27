import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Введите свое имя: ");
            String str = scanner.nextLine();
            if(str.matches("[A-Z][a-z]{1,14}|[А-Я][а-я]{1,14}")){ System.out.println(str); flag = false;}
            else System.out.println("ВВеди имя верно, ты ввел неверно.");
        }
    }
}
