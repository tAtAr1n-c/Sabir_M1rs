import java.util.Scanner;

public class DOP1_9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int[][] array = new int[str][stol];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j]= scanner.nextInt();
            }
        }
        for(int i = 0; i < stol; i++){
            for(int j = 0; j < str; j++) {
                System.out.print(array[j][i] + " ");
            }System.out.println();
        }
    }
}