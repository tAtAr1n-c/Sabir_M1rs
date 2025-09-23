import java.util.Scanner;

public class DOP1_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        System.out.println("Напиши диапазон");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        int[] array = new int[str];
        for (int i = 0; i < str; i++){
            System.out.println("Напиши число - " + i);
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i < str; i++){
            if (array[i] >= a && array[i] <= b){
                count++;
            }
        }
        System.out.println(count);
    }