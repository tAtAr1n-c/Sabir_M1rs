import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        float max = x;

        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }

        System.out.println("Самое большое число: " + max);
    }
}
