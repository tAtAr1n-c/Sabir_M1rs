import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol =  scanner.nextInt();
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
            int count = 0;
            int zcount = 0;
            int qcount = 0;
            for (int j = 0; j < stol; j++){
                while (array[i][j] > 0){
                    if (array[i][j] % 10 % 2 == 0){
                        zcount++;
                    }
                    array[i][j] /= 10;
                    qcount++;
                }
                if (qcount == zcount++) {
                    count++;
                    qcount = 0;
                    zcount = 0;
                }
            }
            if (count == 1){
                finco++;
                count = 0;
            }
        }
        if (finco == str){
            System.out.println("MOLODEC");
        }else{
            System.out.println("NEMOLODEC");
        }
    }
}