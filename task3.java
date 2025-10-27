import java.util.Scanner;
import java.util.regex.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = "<div class=\n" +
                "\"product\">\n" +
                "<h3>Телефон</h3>\n" +
                "<p>Цена: 20000 руб</p>\n" +
                "</div>\n" +
                "<div class=\n" +
                "\"product\">\n" +
                "<h3>Ноутбук</h3>\n" +
                "<p>Цена: 50000 руб</p>\n" +
                "</div>";
        Pattern pat = Pattern.compile("<h3>[а-яА-Яa-zA-Z0-9]*</h3>");
        Matcher mat = pat.matcher(str);
        while(mat.find()){
            String found = mat.group();
            System.out.println("Найден товар: " + found);
        }
    }
}
