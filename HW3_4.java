import java.util.Scanner;

public class CL2_2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int stroka = scanner.nextInt();
    	int[][] array = new int[stroka][stroka];
    	for (int i = 0; i < stroka; i++){
        	for (int j = 0; j < stroka; j++){
        		array[i][i] = 1;
            	System.out.print(array[i][j] + " ");
        	}
        	System.out.println();
    	}
	}
}