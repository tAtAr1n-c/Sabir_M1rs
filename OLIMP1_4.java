import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] array = new int[5];
        int[] array1= {5000, 1000, 100, 50, 10};
        array[0] = x / 5000;
        array[1] = (x - array[0] * 5000) / 1000;
        array[2]   = (x - array[0] * 5000 -  array[1] * 1000) / 100;
        array[3]  = (x - array[0] * 5000 -  array[1] * 1000 - array[2] * 100) / 50;
        array[4]  = (x - array[0] * 5000 -  array[1] * 1000 - array[2] * 100 - array[3] * 50) / 10;
        for(int i = 0; i < 5; i++){
            System.out.println(array[i] + " - " + array1[i]);
        }
    }
}
