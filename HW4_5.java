import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int pst = str / 2;
        int[][] array = new int[str][str];

        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                array[i][j] = 0;
                if (str % 2 != 0){
                    array[pst][j] = 1;
                    array[i][pst] = 1;
                }else {
                    array[pst][j] = 1;
                    array[i][pst] = 1;
                    array[pst - 1][j] = 1;
                    array[i][pst -1 ] = 1;
                }
            }
        }
        for(int i = 0; i < str; i++){
            for(int j = 0; j < str; j++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
    }
}
