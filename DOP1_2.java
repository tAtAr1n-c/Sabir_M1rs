import java.util.Scanner;

public class DOP1_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int chet = 0;
        int nechet = 0;
        int[][] array = new int[str][stol];

        for (int i = 0; i < str; i++){
            for (int j = 0; j< stol; j++){
                System.out.println("Номер [" + i + "] [" + j  + "]");
                array[i][j] = scanner.nextInt();
            }System.out.println();
        }

        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stol; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] % 2 == 0) {
                    chet++;
                } else {
                    nechet++;
                }
            }
            System.out.println();
        }
        System.out.println("ЧЕТНЫХ - " + chet);
        System.out.println("НЕЧЕТНЫХ - " + nechet);
    }
}