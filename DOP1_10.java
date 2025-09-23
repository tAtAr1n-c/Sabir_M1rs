import java.util.Scanner;

public class DOP1_10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int max_str = 0;
        int max_stol = 0;
        int[][] array = new int[str][stol];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j]= scanner.nextInt();
            }
        }

        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++) {
                System.out.print(array[i][j] + " ");
                if (max_str < array[i][j]){
                    max_str = array[i][j];
                }
            }System.out.print("МАКС(" + i + ") = " + max_str);
            System.out.println();
            max_str = 0;
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < stol; i++){
            for(int j = 0; j < str; j++) {
                System.out.print(array[j][i] + " ");
                if (max_stol < array[j][i]){
                    max_stol = array[j][i];
                }
            }System.out.print("МАКС(" + i + ") = " + max_stol);
            System.out.println();
            max_stol = 0;
        }
    }
}