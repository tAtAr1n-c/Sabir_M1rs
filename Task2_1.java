import java.util.Scanner;

public class Task2_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		for (int i = 0; i <= m - 1; i++){
			System.out.print("1");
		} System.out.println();
		for (int z = 0; z <= n - 3; z++){
			System.out.print("1");
			for (int y = 0; y <= m - 3; y++){
				System.out.print(" ");
			}System.out.println("1");
		}
		for (int i = 0; i <= m - 1; i++){
			System.out.print("1");
		}System.out.println();
	}
}