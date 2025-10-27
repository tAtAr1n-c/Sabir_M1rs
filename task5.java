import java.util.Scanner;
import java.util.regex.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = "Сегодня был в #парке и #кино #отдых #выходные";
        Pattern pat = Pattern.compile("#[a-zA-Zа-яА-Я_]*");
        Matcher mat = pat.matcher(str);
        while(mat.find()){
            String found = mat.group();
            System.out.println("Найдена хэштэг: " + found);
        }
    }
}
