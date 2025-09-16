import java.util.Scanner;

public class Task8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		for (int n = 1; n < 11; n++){
			if ((0 < k) && (k < 10)) {
				System.out.println(k + " x " + n + " = " + n * k);
			} else {
				System.out.println("Данное число не является цифрой =)...");
				break;
			}
		}
	}
}