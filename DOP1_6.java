import java.util.Scanner;

public class DOP1_6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        boolean flag = true;
        int[] array = new int[str];
        int proizved = 1;
        for (int i = 0; i < str; i++){
            System.out.println("Напиши число - " + i);
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < str; i++){
            if (array[i] != 0){
                proizved *= array[i];
            }
        }
        System.out.println(proizved);
    }
}
