import java.util.Scanner;

public class Task2_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int x = 1; x <= n; x++){
			int voz = 1;
			for (int i = 1; i <= x; i++){
				voz *= n;
			}
			sum += voz;
		}
		System.out.println(sum);
	}
}