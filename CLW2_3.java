import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int[] array = new int[str];
        for(int i = 0; i < str; i++){
            array[i] = scanner.nextInt();
        }
        for(int j = 0; j < str; j++){
            for (int i = 0; i < str - 1; i++){
                int max = array[i];
                int zapomni = array[i + 1];
                if (zapomni < max){
                    array[i] = zapomni;
                    array[i + 1] = max;
                }
            }
        }
        for(int i = 0; i <str; i ++){
            System.out.print(array[i] + "  ");
        }
    }
}
