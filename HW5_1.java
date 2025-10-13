import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String start = enter.nextLine();
        String konec = "";
        for (int i = 0 ; i < start.length() ; i++){
            char bukva = start.charAt(i);
            if (bukva != ' ' && bukva != '.' && bukva != ',' && bukva != ':'){
                konec = konec + start.charAt(i);
            }
        }
        int count = 0;
        for (int i = 0 ; i < konec.length() ; i++){
            if (ToLower(konec.charAt(i)) != ToLower(konec.charAt(konec.length() - 1 - i))){
                count++;
            }
        }
        System.out.println(konec);
        if (count == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static char ToLower(char x) {
        if ('A' <= x && x <= 'Z') {
            int y = x + 32;
            return (char) y;
        }else{
            return x;
        }
    }
}
