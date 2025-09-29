import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int c5000 = x / 5000;
        int c1000 = (x - c5000 * 5000) / 1000;
        int c100  = (x - c5000 * 5000 -  c1000 * 1000) / 100;
        int c50 = (x - c5000 * 5000 -  c1000 * 1000 - c100 * 100) / 50;
        int c10 = (x - c5000 * 5000 -  c1000 * 1000 - c100 * 100 - c50 * 50) / 10;
        System.out.println("5000: " + c5000);
        System.out.println("1000: " + c1000);
        System.out.println("100: " + c100);
        System.out.println("50: " + c50);
        System.out.println("10: " + c10);

    }
}
