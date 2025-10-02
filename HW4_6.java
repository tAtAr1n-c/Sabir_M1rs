    import  java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int str = scanner.nextInt();
            int[][] array = new int[str][str];
            int[][] array2 = new int[str][str];
            int[][] finall = new int[str][str];

            int sered = str/2;


            for(int i = 0; i < str; i++){
                for(int j = 0; j < str; j++){
                    if (i + j >= sered){
                        array[i][j] = 1;
                    }
                    array2[i][str - j - 1] = array[i][j];
                }
            }

            for(int i = 0; i < str; i++){
                for(int j = 0; j < str; j++){
                    if(array[i][j] == 1 && array2[i][j] == 1){
                        finall[j][i] = 1;
                    }else{
                        finall[j][i] = 0;
                    }
                }
            }
            
            
            for(int i = 0; i < str; i++){
                for(int j = 0; j < str; j++){
                    array[i][j] = finall[i][j];
                    array2[i][str - j - 1] = array[i][j];
                }
            }
                
            for(int i = 0; i < str; i++){
                for(int j = 0; j < str; j++){
                    if(array[i][j] == 1 && array2[i][j] == 1){
                        finall[j][i] = 1;
                    }else{
                        finall[j][i] = 0;
                    }
                }
            }



            for(int i = 0; i < str; i++){
                for(int j = 0; j < str; j++){
                    System.out.print(finall[i][j] + " ");
                } System.out.println();
            }
        }
    }
