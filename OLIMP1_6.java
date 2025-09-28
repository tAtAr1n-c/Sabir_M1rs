import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x =  scanner.nextInt();
        double y = Math.sqrt(x);
        int count = 0;
        for(int i = 2; i <y + 1; i++) {
            if (x % i == 0) {
                count++;
                System.out.println("НЕ ПРОСТОЕ");
                break;
            }
        }
        if (count == 0){
            System.out.println("ПРОСТОЕ");
        }
    }
}
