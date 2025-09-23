import java.util.Scanner;

public class DOP1_8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int sum = 0;
        int[][] array = new int[str][stol];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j]= scanner.nextInt();
            }
        }
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }System.out.print("  Cумма строки " + sum);
            System.out.println();
        }
    }
}