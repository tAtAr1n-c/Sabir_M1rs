import java.util.Scanner;

public class Task2_3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		int vez = 1;
		for (int i = 1; i <= n; i++){
			vez *= n;
			sum += vez;
		} System.out.println(sum);
	}
}