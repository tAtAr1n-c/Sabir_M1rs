import java.util.Scanner;

public class DOP1_1{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int[][] array = new int[str][stol];
        int sum = 0;

        for (int i = 0; i < str; i++){
            for (int j = 0; j < stol; j++){
                System.out.println("Число в позиции [" + i + "] [" + j + "]");
                array[i][j]= scanner.nextInt();
            }System.out.println();
        }

        for (int i = 0; i < str; i++){
            for (int j = 0; j <stol; j++){
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
            }System.out.println();
        }
        System.out.println("СУММА ЧИСЕЛ СНИЗУ");
        System.out.println(sum);
    }
}