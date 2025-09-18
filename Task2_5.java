import java.util.Scanner;

public class Task2_5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		int fac = 1;
		for (int i = 1; i <= n; i++){
			fac *= i;
			sum += fac;
		}System.out.println(sum);
	}
} 