import java.util.Scanner;

public class Task6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		int n = scanner.nextInt();
		if ((n * n) > (x * x) + (y * y)) {
			System.out.println("Да, точка находится в круге");
		} else {
			System.out.println("Нет, точка снаружи");
		}
	}
}