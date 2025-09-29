import java.util.Scanner;

public class Task2{
 	public static void main(String[] args){
 		Scanner scanner = new Scanner(System.in);
 		float a = scanner.nextFloat();
 		float b = scanner.nextFloat();
 		if (a == b) {
 			System.out.println("RAVNO");
 		} else if (a < b) {
 			System.out.println("Б больше А");
 		} else {
 			System.out.println("А больше Б");
 		}
 	}
 }