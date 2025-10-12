import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int c = 0;
        int finco = 0;
        String[][] array = new String[str][stol];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print("Введите слово с индесом [" + i + "] [" + j +  "] : ");
                array[i][j] = scanner.next();
                if(Poslglas(array[i][j])){
                    c++;
                }
            }
            if(c >= 1){
                finco++;
                c = 0;
            }
        }
        if(finco == str){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print(array[i][j] + " ");
            } System.out.println();
        }
    }

    public static boolean Poslglas(String x){
        String bukvi = "уеёыаоэяиюУЕЁЫАОЭЯИЮ";
        int con = 0;
        for (int i = 0; i < bukvi.length();i++){
            if(x.charAt(x.length() - 1) == bukvi.charAt(i)){
                con++;
            }
        }
        if (con == 1){
            return true;
        }else{
            return false;
        }
    }
}
