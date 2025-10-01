import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int[][] array = new int[str][stol];
        int cou = 0;
        int finco = 0;

        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j] = scanner.nextInt();
                if(Podryad(array[i][j]) == true){
                    cou++;
                }
            }
        }
        if (cou == str * 2){
            System.out.println("DA VO VSEH");
        }else{
            System.out.println("NET NE VO VSEH");
        }
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
    }

    public static boolean Podryad(int x){
        while (x >= 10) {
            int  sprav= x % 10;
            int  slev= (x / 10) % 10;
            if (slev >= sprav) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
