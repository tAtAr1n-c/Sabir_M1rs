import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String predl = scanner.nextLine().trim();
        String zapomni = "";
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
            }
        }
        System.out.println(c + " ----- " + zapomni);
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
        for(int i = 0; i < x.length(); i++){
            if(bukvi.contains(x.charAt(i) + "")){
                finco++;
            }
        }
        return finco;
    }
}
