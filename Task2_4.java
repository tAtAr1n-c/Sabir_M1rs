import java.util.Scanner;

public class Task2_4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		int vez = 2;
		for (int i = 1; i <= n; i++){
			sum += vez;
			vez *= 2;
		}System.out.println(sum);
	}
}