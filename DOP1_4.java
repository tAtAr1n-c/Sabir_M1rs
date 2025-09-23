import java.util.Scanner;

public class DOP1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        boolean flag = true;
        int[] array = new int[str];
        for (int i = 0; i < str; i++){
            System.out.println("Напиши число");
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < str - 1; i++){
            if (array[i] >= array[i + 1]){
                flag = false;
                break;
            }
        } System.out.println(flag);
    }
}