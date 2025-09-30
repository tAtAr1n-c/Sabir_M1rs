import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int stol = scanner.nextInt();
        int finco = 0;
        boolean flag = true;
        int[][] array = new int[str][stol];
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
            int sum = Sumc(array[0][i]);
            for(int j = 0; j < stol; j++){
                if(sum != Sumc(array[j][i])){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                finco++;
                break;
            }else{
                flag = true;
            }
        }
        if (finco >= 1){
            System.out.println("True");
        }else{
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


}
