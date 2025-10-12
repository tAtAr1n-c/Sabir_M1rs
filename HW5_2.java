import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String predl = scanner.nextLine().trim();
        String zapomni = "";
        String zapor = "";
        int n = kolvosl(predl);
        int c = 0;
        for(int i = 0; i < n; i++){
            zapomni = "";
            for(int j = 0; j < predl.length(); j++){
                if(predl.charAt(j) !=  ' '){
                    zapomni += predl.charAt(j);
                } else{
                    break;
                }
            }
            predl = predl.replace(zapomni + " ", "");
            if(c <= kolvobuk(zapomni)){
                c = kolvobuk(zapomni);
                zapor = zapomni;
            }
        }
        System.out.println(c + " ----- " + zapor);
    }



    public static int kolvosl(String x){
        int finco = 1;
        for(int i = 0; i < x.length(); i++){
            if(x.charAt(i) == ' '){
                finco++;
            }
        }
        return finco;
    }

    public static int kolvobuk(String x){
        String bukvi = "уеёыаоэяиюУЕЁЫАОЭЯИЮ";
        int finco = 0;
        for(int i = 0; i < bukvi.length(); i++){
            char gl =  bukvi.charAt(i);
            for(int j = 0; j < x.length(); j++){
                if(gl == x.charAt(j)){
                    finco++;
                }
            }

        }
        return finco;
    }
}

