import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int[][] array = new int[str][stol];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print("Введите число с индексом [" + i + "] [" + j + "]" + " : ");
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print(array[i][str - j - 1] + " ");
            } System.out.println();
        }
    }
}
