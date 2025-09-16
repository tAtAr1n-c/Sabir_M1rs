import java.util.Scanner;

public class Task12{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n == 0){
			System.out.println("0");
		} else{
			int r = 0;
			int k = 1;
			while (n > 0){
				r += (n % 2) * k;
				k *= 10;
				if (n % 2 == 0){
					n = n / 2;
				} else {
					n = (n / 2);
				}
			}System.out.println(r);
		}
	}
}