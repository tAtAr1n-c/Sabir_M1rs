
import java.util.Scanner;

public class Task2_6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float x = scanner.nextFloat();
        int factorial = 1;
        float step = x;
        float summa = 0;
        for (int k = 1 ; k <= n ; k++){
            factorial *= k;
            summa += (factorial * x);
            x *= step;
        }
        System.out.println("Примернo : " + summa);
    }
}