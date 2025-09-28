import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        int count = 0;
        while(x > 0){
            x /= 10;
            count++;
        }
        System.out.println(count);
    }
}
