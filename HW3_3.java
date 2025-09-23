import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int finco = 0;
        int[][] array = new int[str][stol];
        for (int i = 0; i < str; i++){
            for (int j = 0; j < stol; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < str; i++){
            for (int j = 0;j < stol; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < str; i++){
            int sum = 0;
            int count = 0;
            for (int j = 0; j < stol; j++){
                while (array[i][j] > 0){
                    sum += (array[i][j] % 10);
                    array[i][j] /= 10;
                }
                if (sum % 5 ==0) {
                    count++;
                    sum = 0;
                }
            }
            if (count >= 2){
                finco++;
            }
        }
        if (finco == str){
            System.out.println("MOLODEC");
        }else{
            System.out.println("NEMOLODEC");
        }
    }
}