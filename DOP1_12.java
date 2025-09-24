import java.util.Scanner;

public class DOP1_12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int[][] array = new int[str][str];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                array[i][i] = 1;
                array[i][str - i - 1]= 2;
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
    }
}