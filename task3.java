import java.util.Scanner;
import java.util.regex.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = "[ERROR] 2024-01-15: Connection failed\n" +
                "[INFO] 2024-01-15: User logged in\n" +
                "[DEBUG] 2024-01-15: Processing request\n" +
                "[ERROR] 2024-01-15: Database timeout";

        Pattern pat = Pattern.compile("\\[ERROR] \\d{4}-\\d{2}-\\d{2}: \\w*");
        Matcher mat = pat.matcher(str);
        while(mat.find()){
            String found = mat.group();
            System.out.println("Найдена ошибка: " + found);
        }
    }
}
