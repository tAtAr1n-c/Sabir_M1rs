import java.util.Scanner;

public class DOP1_3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int[] array = new int[str];
        for (int i = 0; i < str; i++){
                array[i]= scanner.nextInt();
        }
        for (int i = 0; i < str; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int[] vtor = new int[str];
        vtor[0] = array[str - 1];
        for (int i = 1; i < str; i++){
            vtor[i] = array[i - 1];
        }
        for (int i = 0; i < str; i++){
            System.out.print(vtor[i] + " ");
        }
    }
}