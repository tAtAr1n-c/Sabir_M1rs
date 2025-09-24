import java.util.Scanner;

public class DOP1_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива 1: ");
        int str1 = scanner.nextInt();
        System.out.print("Введите количество столб массива 1: ");
        int stol1 = scanner.nextInt();
        System.out.print("Введите количество строк массива 2: ");
        int str2 = scanner.nextInt();
        System.out.print("Введите количество столб массива 1: ");
        int stol2 = scanner.nextInt();
        int[][] array1 = new int[str1][stol1];
        int[][] array2 = new int[str2][stol2];
        int[][] array3 = new int[str1][stol1 + stol2];
        for(int i = 0; i < str1; i++){
            for(int j = 0; j < stol1; j++){
                System.out.print("Введите число для [" + i + "] индекса: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < str2; i++){
            for(int j = 0; j < stol2; j++){
                System.out.print("Введите число для [" + i + "] индекса: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        
        for(int i = 0; i < str1; i++){
            for(int j = 0; j < stol1 + stol2; j++){
                if ((i + j) % 2 == 0){
                    array3[i][j] = array1[i][j / 2];
                }else{
                    array3[i][j] = array2[i][j / 2];
                }
            }
        }
        
        
        for(int i = 0; i < str1; i++){
            for(int j = 0; j < stol1; j++){
                System.out.print(array1[i][j] + " ");
            }System.out.println();
        }

        for(int i = 0; i < str2; i++){
            for(int j = 0; j < stol2; j++){
                System.out.print(array2[i][j] + " ");
            }System.out.println();
        }

        for(int i = 0; i < str1; i++){
            for(int j = 0; j < stol1 + stol2; j++){
                System.out.print(array3[i][j] + " ");
            }System.out.println();
        }

    }
}