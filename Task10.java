import java.util.Scanner;

public class Task10{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int n = 1;
		while (x != 0){
			int k = x % 10;
			if (k != 0){
				System.out.print(k * n + " + ");
			}
			x = x / 10;
			n = n * 10;
		}System.out.println();
	}
}