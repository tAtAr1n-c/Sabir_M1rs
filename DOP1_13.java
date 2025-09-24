import java.util.Scanner;

public class DOP1_13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int[][] array = new int[str][str];
        int sum = 0;
        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                System.out.print("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }

        for(int i = (str/2 - 1); i <= (str/2 + 1) ; i++){
            for(int j = (str/2 - 1); j <= (str/2 + 1); j++){
                sum += array[i][j];
            }
        }
        sum -= array[str/2][str/2];
        System.out.println(sum);
    }
}