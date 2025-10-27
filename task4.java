import java.util.Scanner;
import java.util.regex.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
        Pattern pat = Pattern.compile("[a-zA-Zа-яА-Я0-9,]+;?");
        Matcher mat = pat.matcher(str);
        while(mat.find()){
            String found = mat.group();
            System.out.println("Информация про участников: " + found);
        }
    }
}
