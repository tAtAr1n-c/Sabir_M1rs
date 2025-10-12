import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol =  scanner.nextInt();
        String[][] array = new String[str][stol];
        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                array[i][j] = scanner.next();
            }
        }
        for (int i = 0; i < stol; i++) {
            for (int j = 0; j < str; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(array[j][i]);
            }
            System.out.println();
        }
    }
}
