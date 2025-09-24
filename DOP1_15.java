import java.util.Scanner;

public class DOP1_15{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int[][] array = new int[str][str];
        int sumk = 0;
        int sumc = 0;
        int sumd = 0;
        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                System.out.print(array[i][j] + " ");
                while (array[i][j] > 0){
                    sumc += array[i][j] % 10;
                    array[i][j] /= 10;
                }
                if (sumc % 7 == 0){
                    sumk++;
                }
                sumc = 0;
            }
            if (sumk >= 1){
                sumd++;
            }
            System.out.println();
            sumk = 0;
        }
        if (sumd == str){
            System.out.println("ДА в каждой строке есть");
        }else {
            System.out.println("Нет не все");
        }
    }
}