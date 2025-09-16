import java.util.Scanner;

public class Task5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		float n = scanner.nextInt();
		int o = 0;
		if ((n >= x + (n / 2)) && (n >= y + (n / 2)) && (o <= x + (n / 2)) && (o <= y + (n / 2))){
			System.out.println("Да,попадает");
		}else {
			System.out.println("Нет, не попадает");
		}
	}
}