import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int finco = 0;
        int[][] array = new int[str][stol];
        for(int i = 0; i < str; i ++){
            for(int j = 0; j < stol; j ++){
                System.out.println("Введите число с номером [" + i + "] [" +  j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < str; i++){
            int cou = 0;
            for(int j = 0; j < stol; j++){
                if(array[i][j] == Perevo(array[i][j])){
                    cou++;
                }
            }if(cou != 1){
                System.out.println("НЕ ВО ВСЕХ");
            }else finco++;
        }
        for(int i = 0; i < str; i ++){
            for(int j = 0; j < stol; j ++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }
        if (finco == str){
            System.out.println("ВО ВСЕХ");
        }
    }

  
    public static int Perevo(int x){
        int res = 0;
        while(x > 0){
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
