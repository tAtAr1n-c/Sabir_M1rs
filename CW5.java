import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String str = "Здравствуйте! Меня зовут Иван Иванов. Контакты: email: test@mail.ru, телефон: +7-495-123-4567. Продажи: $1000, $250, $75. Числа: 10, 20.5, 3.14, 100. Цифры: 1, 2, 3. Еще контакты: support@company.com, +7-800-100-5050. Адрес: Москва, ул. Ленина, д.15. Дата: 25.12.2023. Время: 12:30. Спецсимволы: !@#$%^&*(). Ждем вас! :)";
        System.out.println(statsl(str));
        System.out.println();
        System.out.println(statchis(str));
        System.out.println();
        System.out.println(statcontact(str));
        System.out.println();
        System.out.println(simv(str));
        System.out.println();
        System.out.println(predlstat(str));
    }
    public static int strtoint(String str){
        String j = "";
        int x = 0, z = 1;
        for(int i = 0; i < str.length(); i++) j=str.charAt(i) + j;
        for(int i = 0; i < str.length(); i++){
            x += (j.charAt(i) - 48) * z;
            z *= 10;
        }
        return x;
    }
    public static float strtofloat(String str){
        float result = 0;
        boolean a = false;
        float k = 1;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '.'){
                a = true;
                continue;
            }
            if(a){
                k /= 10;
                result += (c - 48) * k;
            } else {
                result = result * 10 + (c - 48);
            }
        }
        return result;
    }
    public static String ubrat(String str){
        String strnew = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ',' && str.charAt(i) != '(' && str.charAt(i) != ')' && str.charAt(i) != '!' && str.charAt(i) != ':' && str.charAt(i) != ';'){
                strnew += str.charAt(i);
            }
        }
        return strnew;
    }
    public static String ubrat1(String str){
        String strnew = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ',' && str.charAt(i) != '$' && str.charAt(i) != ')' && str.charAt(i) != '!' && str.charAt(i) != ':' && str.charAt(i) != ';'){
                strnew += str.charAt(i);
            }
        }
        return strnew;
    }
    public static int kolvo(String str){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static String[] split1(String x){
        String str = ubrat(x);
        String[] array = new String[kolvo(str)];
        int s = 0;
        String w = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                w += str.charAt(i);
            }else{
                array[s] = w;
                w = "";
                s++;
            }
            if(i == str.length()-1){
                array[s] = w;
            }
        }
        return array;
    }
    public static String statsl(String x){
        int dlin = 0;
        int kolvslov = 1;
        int k = 0;
        String[] z = split1(x);
        int max = 0;
        String str = ubrat(x);
        for(int i = 0; i < z.length; i++){
            if (z[i].length() > max && z[i].matches("[a-zA-Zа-яА-Я]+")){
                max = z[i].length();
            }
            if(z[i].matches("[a-zA-Zа-яА-Я]+")){
                kolvslov++;
            }
        }
        return "Слов: " + kolvslov + "\n Самое длинное: " + max;
    }
    public static String statchis(String x){
        int count = 0;
        String vs = "Все числа: ";
        String[] z = split1(x);
        int sum = 0;
        int summ = 0;
        for(int i = 0; i < z.length; i++){
            if (z[i].matches("\\d+(\\.\\d+)?")) {
                vs += ubrat1(z[i]) + " ";
                count++;
                sum += strtofloat(z[i]);
            }
            String k = "";
            if(z[i].matches("\\$\\d+")){
                summ += strtoint(ubrat1(z[i]));
            }
        }
        int l = 0;
        String w = "\nСумма товаров: " + summ;
        String sr = "\nСреднее значение: " + (count > 0 ? sum /count : 0);
        return vs + w + sr;
    }
    public static String statcontact(String str){
        String[] array = split1(str);
        String found1 = "Email адреса: \n";
        String found2 = "\nНомера Телефонов: \n";
        for(int i = 0; i < array.length; i++){
            if(array[i].matches("\\+7-\\d{3}-\\d{3}-\\d{4}\\.?")) found2 += array[i] + "\n";
            if(array[i].matches("\\w+@([a-z0-9-_.]+).(com|ru)\\.?")) found1 += array[i] + "\n";
        }
        String x = found1 + found2;
        return x;
    }
    public static String simv(String str){
        int couobch = 0;
        int coudwp = 0;
        int spec = 0;
        for(int i = 0; i < str.length(); i++){
            String k = str.charAt(i) + "";
            if(k.matches("[A-Za-zа-яА-Я1-9 ]")) coudwp++;
            if(k.matches("[!@#$%^&*(){}\\[\\]<>:]")) spec++;
            if(k.matches(".")) couobch++;
        }
        String x = "Кол-во символов: " + couobch + "\nКол-во букв, цифр, пробелов: " + coudwp + "\nКол-во спец.символов: " + spec;
        return x;
    }
    public static String predlstat(String x){
        int toch = 0;
        double sred = 0;
        for(int i = 0; i < x.length() - 1; i++){
            if(x.charAt(i) == '.' && x.charAt(i + 1) == ' '){
                toch++;
            }
        }
        double cou = (x.length() - toch) / toch;
        String k = "Колво предложений: " + toch + "\n Средняя длинна: " + cou;
        return k;
    }
}
