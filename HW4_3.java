import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int[][] array = new int[str][stol];
        int finco = 0;

        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }


        for(int i = 0; i < str; i++){
            for(int j = 0; j < stol; j++){
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }

        for(int i = 0; i < str; i++){
            int count = 0;
            for(int j = 0; j < stol; j++){
                if(Prost(array[i][j]) == true && Prost(Sumc(array[i][j])) == true){
                    count++;
                    finco++;
                    break;
                }
            }
        }
        if(finco == str){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }


    public static int Sumc(int i){
        int sum = 0;
        while (i > 0){
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }


    public static boolean Prost(int x){
        int count = 0;
        for(int j = 1; j <= x; j++){
            if (x % j == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
    
    
}
