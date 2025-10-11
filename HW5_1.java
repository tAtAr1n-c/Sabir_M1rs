import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String bukvi = scanner.nextLine().replace(" ", "").toLowerCase().replace(",", "").replace(".", "");
        for(int i = 0; i < bukvi.length(); i++){
            if(bukvi.charAt(i) != bukvi.charAt(bukvi.length() - 1 - i)){
                flag = false;
            }
        }
        if (flag == true){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
