import java.util.Scanner;

public class Task13{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int pred = 0;
		int sled = scanner.nextInt();
		while (sled > pred){
				pred = sled;
				sled = scanner.nextInt();
		}
		System.out.println("ВСЕ БОЛЬШЕ НЕ МОЖЕШЬ");
	} 
}