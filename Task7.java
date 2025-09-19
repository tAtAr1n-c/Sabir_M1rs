import java.util.Scanner;

public class Task7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		int count = 0;
		for (int n = 0; n < 11; n++){
			if ((n * n) >= ((x * x) + (y * y))){
				System.out.println("ТЫ ПОПАЛ В РАДИУС" + " " + n);
				count++;
				break;
			}
		}
		if (count == 0){
			System.out.println("missed");
		}
	}
}
