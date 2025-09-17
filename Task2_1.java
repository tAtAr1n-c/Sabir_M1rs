import java.util.Scanner;

public class Task2_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		for (int i = 1; i <= m; i++){
			System.out.print("1");
		} System.out.println();
		for (int z = 1; z <= n - 2; z++){
			System.out.print("1");
			for (int y = 1; y <= m - 2; y++){
				System.out.print(" ");
			}System.out.println("1");
		}
		for (int i = 1; i <= m; i++){
			System.out.print("1");
		}System.out.println();
	}
}
