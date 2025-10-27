import java.util.Scanner;
import java.util.regex.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Pattern pat = Pattern.compile("\\[ERROR] \\d{4}-\\d{2}-\\d{2}: \\w*");
        Matcher mat = pat.matcher(str);
        while(mat.find()){
            String found = mat.group();
            System.out.println("Найдена цитата: " + found);
        }
    }
}
