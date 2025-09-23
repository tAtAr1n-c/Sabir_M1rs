import java.util.Scanner;

public class HW3_1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int str = scanner.nextInt();
		int stol = scanner.nextInt();
		int finco = 0;
		int[][] array = new int[str][stol];
		for (int i = 0; i < str; i++){for (int j = 0; j < str; j++){System.out.println("Введи число для индекса [" + i + "] [" + j + "]");array[i][j] = scanner.nextInt();}}
		for (int i = 0; i < str; i++){for (int j = 0;j < stol; j++){System.out.print(array[i][j] + " ");}System.out.println();}

		for (int j = 0; j < stol; j++){
			int count = 0;
			for (int i = 0; i < str; i++){
				if (array[i][j] % 3 == 0){
					count += 1;
				}
			}
			if (count == stol){
				System.out.println("NORM");
				finco += 1;
				break;
			}else{
				continue;
			}
		}if (finco == 0){
			System.out.println("NET");
		}
	}
}