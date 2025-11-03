import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String h = scanner.nextLine();
        int count = 0;
        boolean flag = true;
        while(flag){
            switch(h){
                case "1": {
                    scanner.nextLine();
                    String z = scanner.nextLine();
                    System.out.println(Find(input, z));
                    count++;
                }
                case "2":{
                    scanner.nextLine();
                    String y = scanner.nextLine();
                    String z = scanner.nextLine();
                    System.out.println(Replace(input, y, z));
                    count++;
                }
                case "3": {
                    if(count != 0){
                        scanner.nextLine();
                    }
                    String[] array = Split(input);
                    for(int i = 0; i < array.length; i++){
                        System.out.print(array[i]);
                        System.out.println();
                    }
                    count++;
                }
                case "4": {
                    scanner.nextLine();
                    int z = scanner.nextInt();
                    String[] array = new String[z];
                    System.out.print("Вводите слова: ");
                    for(int i = 0; i < array.length; i++){
                        array[i] = scanner.nextLine();
                    }
                    System.out.println(join(array));
                    count++;
                }

                case "0": {
                    flag = false;
                }

            }
        }
    }

    public static String join(String[] array){
        String str = "";
        for(int i = 0; i < array.length; i++){
            str += array[i] + " ";
        }
        return str;
    }

    public static int Kolvosl(String x) {
        int finco = 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                finco++;
            }
        }
        return finco;
    }

    public static String Replace(String x, String y, String z){
        int n = y.length();
        int k = Find(x, y);
        String res = "";
        for(int i = 0; i < k; i++ ){
            res = res + x.charAt(i);
        }
        res += z;
        for (int i = k + n; i < x.length(); i++){
            res = res + x.charAt(i);
        }
        return res;
    }

    public static int Find(String str, String whatFind) {
        int x = 0;
        for (int i = 0; i <= (str.length() - whatFind.length()); i++) {
            boolean find = true;
            for (int j = 0; j < whatFind.length(); j++) {
                if (str.charAt(i + j) != whatFind.charAt(j)) {
                    find = false;
                    break;
                }
            }
            if (find) {
                x = i;
            }
        }
        return x;
    }

    public static String[] Split(String x) {
        String zapomni = "";
        String zapor = "";
        int n = Kolvosl(x);
        String[] vivod = new String[n];
        for (int i = 0; i < n; i++) {
            zapomni = "";
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) != ' ') {
                    zapomni += x.charAt(j);
                } else {
                    break;
                }
            }
            vivod[i] = zapomni;
            x = Replace(x, zapomni + " ", "");
        }
        return vivod;
    }
}
